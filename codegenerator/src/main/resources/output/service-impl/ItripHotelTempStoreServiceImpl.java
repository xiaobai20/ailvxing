package cn.kgc.itrip.service.impl;
import cn.kgc.itrip.service.ItripHotelTempStoreService;
import cn.kgc.itrip.mapper.ItripHotelTempStoreMapper;
import cn.kgc.itrip.model.ItripHotelTempStore;
import cn.kgc.itrip.common.EmptyUtils;
import cn.kgc.itrip.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Constants;

@Service("itripHotelTempStoreService")
public class ItripHotelTempStoreServiceImpl implements ItripHotelTempStoreService {

    @Resource
    private ItripHotelTempStoreMapper itripHotelTempStoreMapper;

    public ItripHotelTempStore getById(Long id)throws Exception{
        return itripHotelTempStoreMapper.getById(id);
    }

    public List<ItripHotelTempStore> getListByMap(Map<String,Object> param)throws Exception{
        return itripHotelTempStoreMapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return itripHotelTempStoreMapper.getCountByMap(param);
    }

    public Integer save(ItripHotelTempStore itripHotelTempStore)throws Exception{
            itripHotelTempStore.setCreationDate(new Date());
            return itripHotelTempStoreMapper.save(itripHotelTempStore);
    }

    public Integer modify(ItripHotelTempStore itripHotelTempStore)throws Exception{
        itripHotelTempStore.setModifyDate(new Date());
        return itripHotelTempStoreMapper.modify(itripHotelTempStore);
    }

    public Integer removeById(Long id)throws Exception{
        return itripHotelTempStoreMapper.removeById(id);
    }

    public Page<List<ItripHotelTempStore>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = itripHotelTempStoreMapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripHotelTempStore> itripHotelTempStoreList = itripHotelTempStoreMapper.getListByMap(param);
        page.setRows(itripHotelTempStoreList);
        return page;
    }

}
