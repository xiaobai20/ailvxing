package cn.kgc.itrip.service.impl;
import cn.kgc.itrip.service.ItripAreaDicService;
import cn.kgc.itrip.mapper.ItripAreaDicMapper;
import cn.kgc.itrip.model.ItripAreaDic;
import cn.kgc.itrip.common.EmptyUtils;
import cn.kgc.itrip.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Constants;

@Service("itripAreaDicService")
public class ItripAreaDicServiceImpl implements ItripAreaDicService {

    @Resource
    private ItripAreaDicMapper itripAreaDicMapper;

    public ItripAreaDic getById(Long id)throws Exception{
        return itripAreaDicMapper.getById(id);
    }

    public List<ItripAreaDic> getListByMap(Map<String,Object> param)throws Exception{
        return itripAreaDicMapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return itripAreaDicMapper.getCountByMap(param);
    }

    public Integer save(ItripAreaDic itripAreaDic)throws Exception{
            itripAreaDic.setCreationDate(new Date());
            return itripAreaDicMapper.save(itripAreaDic);
    }

    public Integer modify(ItripAreaDic itripAreaDic)throws Exception{
        itripAreaDic.setModifyDate(new Date());
        return itripAreaDicMapper.modify(itripAreaDic);
    }

    public Integer removeById(Long id)throws Exception{
        return itripAreaDicMapper.removeById(id);
    }

    public Page<List<ItripAreaDic>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = itripAreaDicMapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripAreaDic> itripAreaDicList = itripAreaDicMapper.getListByMap(param);
        page.setRows(itripAreaDicList);
        return page;
    }

}
