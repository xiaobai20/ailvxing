package cn.kgc.itrip.service.impl;
import cn.kgc.itrip.service.ItripProductStoreService;
import cn.kgc.itrip.mapper.ItripProductStoreMapper;
import cn.kgc.itrip.model.ItripProductStore;
import cn.kgc.itrip.common.EmptyUtils;
import cn.kgc.itrip.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Constants;

@Service("itripProductStoreService")
public class ItripProductStoreServiceImpl implements ItripProductStoreService {

    @Resource
    private ItripProductStoreMapper itripProductStoreMapper;

    public ItripProductStore getById(Long id)throws Exception{
        return itripProductStoreMapper.getById(id);
    }

    public List<ItripProductStore> getListByMap(Map<String,Object> param)throws Exception{
        return itripProductStoreMapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return itripProductStoreMapper.getCountByMap(param);
    }

    public Integer save(ItripProductStore itripProductStore)throws Exception{
            itripProductStore.setCreationDate(new Date());
            return itripProductStoreMapper.save(itripProductStore);
    }

    public Integer modify(ItripProductStore itripProductStore)throws Exception{
        itripProductStore.setModifyDate(new Date());
        return itripProductStoreMapper.modify(itripProductStore);
    }

    public Integer removeById(Long id)throws Exception{
        return itripProductStoreMapper.removeById(id);
    }

    public Page<List<ItripProductStore>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = itripProductStoreMapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripProductStore> itripProductStoreList = itripProductStoreMapper.getListByMap(param);
        page.setRows(itripProductStoreList);
        return page;
    }

}
