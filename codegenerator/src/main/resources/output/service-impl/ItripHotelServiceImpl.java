package cn.kgc.itrip.service.impl;
import cn.kgc.itrip.service.ItripHotelService;
import cn.kgc.itrip.mapper.ItripHotelMapper;
import cn.kgc.itrip.model.ItripHotel;
import cn.kgc.itrip.common.EmptyUtils;
import cn.kgc.itrip.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Constants;

@Service("itripHotelService")
public class ItripHotelServiceImpl implements ItripHotelService {

    @Resource
    private ItripHotelMapper itripHotelMapper;

    public ItripHotel getById(Long id)throws Exception{
        return itripHotelMapper.getById(id);
    }

    public List<ItripHotel> getListByMap(Map<String,Object> param)throws Exception{
        return itripHotelMapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return itripHotelMapper.getCountByMap(param);
    }

    public Integer save(ItripHotel itripHotel)throws Exception{
            itripHotel.setCreationDate(new Date());
            return itripHotelMapper.save(itripHotel);
    }

    public Integer modify(ItripHotel itripHotel)throws Exception{
        itripHotel.setModifyDate(new Date());
        return itripHotelMapper.modify(itripHotel);
    }

    public Integer removeById(Long id)throws Exception{
        return itripHotelMapper.removeById(id);
    }

    public Page<List<ItripHotel>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = itripHotelMapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripHotel> itripHotelList = itripHotelMapper.getListByMap(param);
        page.setRows(itripHotelList);
        return page;
    }

}
