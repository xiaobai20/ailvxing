package cn.kgc.itrip.service.impl;
import cn.kgc.itrip.service.ItripLabelDicService;
import cn.kgc.itrip.mapper.ItripLabelDicMapper;
import cn.kgc.itrip.model.ItripLabelDic;
import cn.kgc.itrip.common.EmptyUtils;
import cn.kgc.itrip.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Constants;

@Service("itripLabelDicService")
public class ItripLabelDicServiceImpl implements ItripLabelDicService {

    @Resource
    private ItripLabelDicMapper itripLabelDicMapper;

    public ItripLabelDic getById(Long id)throws Exception{
        return itripLabelDicMapper.getById(id);
    }

    public List<ItripLabelDic> getListByMap(Map<String,Object> param)throws Exception{
        return itripLabelDicMapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return itripLabelDicMapper.getCountByMap(param);
    }

    public Integer save(ItripLabelDic itripLabelDic)throws Exception{
            itripLabelDic.setCreationDate(new Date());
            return itripLabelDicMapper.save(itripLabelDic);
    }

    public Integer modify(ItripLabelDic itripLabelDic)throws Exception{
        itripLabelDic.setModifyDate(new Date());
        return itripLabelDicMapper.modify(itripLabelDic);
    }

    public Integer removeById(Long id)throws Exception{
        return itripLabelDicMapper.removeById(id);
    }

    public Page<List<ItripLabelDic>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = itripLabelDicMapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripLabelDic> itripLabelDicList = itripLabelDicMapper.getListByMap(param);
        page.setRows(itripLabelDicList);
        return page;
    }

}
