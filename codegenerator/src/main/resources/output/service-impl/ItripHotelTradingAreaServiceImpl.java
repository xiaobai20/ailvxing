package cn.kgc.itrip.service.impl;
import cn.kgc.itrip.service.ItripHotelTradingAreaService;
import cn.kgc.itrip.mapper.ItripHotelTradingAreaMapper;
import cn.kgc.itrip.model.ItripHotelTradingArea;
import cn.kgc.itrip.common.EmptyUtils;
import cn.kgc.itrip.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Constants;

@Service("itripHotelTradingAreaService")
public class ItripHotelTradingAreaServiceImpl implements ItripHotelTradingAreaService {

    @Resource
    private ItripHotelTradingAreaMapper itripHotelTradingAreaMapper;

    public ItripHotelTradingArea getById(Long id)throws Exception{
        return itripHotelTradingAreaMapper.getById(id);
    }

    public List<ItripHotelTradingArea> getListByMap(Map<String,Object> param)throws Exception{
        return itripHotelTradingAreaMapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return itripHotelTradingAreaMapper.getCountByMap(param);
    }

    public Integer save(ItripHotelTradingArea itripHotelTradingArea)throws Exception{
            itripHotelTradingArea.setCreationDate(new Date());
            return itripHotelTradingAreaMapper.save(itripHotelTradingArea);
    }

    public Integer modify(ItripHotelTradingArea itripHotelTradingArea)throws Exception{
        itripHotelTradingArea.setModifyDate(new Date());
        return itripHotelTradingAreaMapper.modify(itripHotelTradingArea);
    }

    public Integer removeById(Long id)throws Exception{
        return itripHotelTradingAreaMapper.removeById(id);
    }

    public Page<List<ItripHotelTradingArea>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = itripHotelTradingAreaMapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripHotelTradingArea> itripHotelTradingAreaList = itripHotelTradingAreaMapper.getListByMap(param);
        page.setRows(itripHotelTradingAreaList);
        return page;
    }

}
