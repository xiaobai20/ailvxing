package cn.kgc.itrip.service.impl;
import cn.kgc.itrip.service.ItripHotelOrderService;
import cn.kgc.itrip.mapper.ItripHotelOrderMapper;
import cn.kgc.itrip.model.ItripHotelOrder;
import cn.kgc.itrip.common.EmptyUtils;
import cn.kgc.itrip.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Constants;

@Service("itripHotelOrderService")
public class ItripHotelOrderServiceImpl implements ItripHotelOrderService {

    @Resource
    private ItripHotelOrderMapper itripHotelOrderMapper;

    public ItripHotelOrder getById(Long id)throws Exception{
        return itripHotelOrderMapper.getById(id);
    }

    public List<ItripHotelOrder> getListByMap(Map<String,Object> param)throws Exception{
        return itripHotelOrderMapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return itripHotelOrderMapper.getCountByMap(param);
    }

    public Integer save(ItripHotelOrder itripHotelOrder)throws Exception{
            itripHotelOrder.setCreationDate(new Date());
            return itripHotelOrderMapper.save(itripHotelOrder);
    }

    public Integer modify(ItripHotelOrder itripHotelOrder)throws Exception{
        itripHotelOrder.setModifyDate(new Date());
        return itripHotelOrderMapper.modify(itripHotelOrder);
    }

    public Integer removeById(Long id)throws Exception{
        return itripHotelOrderMapper.removeById(id);
    }

    public Page<List<ItripHotelOrder>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = itripHotelOrderMapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripHotelOrder> itripHotelOrderList = itripHotelOrderMapper.getListByMap(param);
        page.setRows(itripHotelOrderList);
        return page;
    }

}
