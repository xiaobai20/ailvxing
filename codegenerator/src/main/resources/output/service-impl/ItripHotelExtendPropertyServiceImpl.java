package cn.kgc.itrip.service.impl;
import cn.kgc.itrip.service.ItripHotelExtendPropertyService;
import cn.kgc.itrip.mapper.ItripHotelExtendPropertyMapper;
import cn.kgc.itrip.model.ItripHotelExtendProperty;
import cn.kgc.itrip.common.EmptyUtils;
import cn.kgc.itrip.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Constants;

@Service("itripHotelExtendPropertyService")
public class ItripHotelExtendPropertyServiceImpl implements ItripHotelExtendPropertyService {

    @Resource
    private ItripHotelExtendPropertyMapper itripHotelExtendPropertyMapper;

    public ItripHotelExtendProperty getById(Long id)throws Exception{
        return itripHotelExtendPropertyMapper.getById(id);
    }

    public List<ItripHotelExtendProperty> getListByMap(Map<String,Object> param)throws Exception{
        return itripHotelExtendPropertyMapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return itripHotelExtendPropertyMapper.getCountByMap(param);
    }

    public Integer save(ItripHotelExtendProperty itripHotelExtendProperty)throws Exception{
            itripHotelExtendProperty.setCreationDate(new Date());
            return itripHotelExtendPropertyMapper.save(itripHotelExtendProperty);
    }

    public Integer modify(ItripHotelExtendProperty itripHotelExtendProperty)throws Exception{
        itripHotelExtendProperty.setModifyDate(new Date());
        return itripHotelExtendPropertyMapper.modify(itripHotelExtendProperty);
    }

    public Integer removeById(Long id)throws Exception{
        return itripHotelExtendPropertyMapper.removeById(id);
    }

    public Page<List<ItripHotelExtendProperty>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = itripHotelExtendPropertyMapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripHotelExtendProperty> itripHotelExtendPropertyList = itripHotelExtendPropertyMapper.getListByMap(param);
        page.setRows(itripHotelExtendPropertyList);
        return page;
    }

}
