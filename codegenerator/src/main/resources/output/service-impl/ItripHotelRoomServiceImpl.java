package cn.kgc.itrip.service.impl;
import cn.kgc.itrip.service.ItripHotelRoomService;
import cn.kgc.itrip.mapper.ItripHotelRoomMapper;
import cn.kgc.itrip.model.ItripHotelRoom;
import cn.kgc.itrip.common.EmptyUtils;
import cn.kgc.itrip.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Constants;

@Service("itripHotelRoomService")
public class ItripHotelRoomServiceImpl implements ItripHotelRoomService {

    @Resource
    private ItripHotelRoomMapper itripHotelRoomMapper;

    public ItripHotelRoom getById(Long id)throws Exception{
        return itripHotelRoomMapper.getById(id);
    }

    public List<ItripHotelRoom> getListByMap(Map<String,Object> param)throws Exception{
        return itripHotelRoomMapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return itripHotelRoomMapper.getCountByMap(param);
    }

    public Integer save(ItripHotelRoom itripHotelRoom)throws Exception{
            itripHotelRoom.setCreationDate(new Date());
            return itripHotelRoomMapper.save(itripHotelRoom);
    }

    public Integer modify(ItripHotelRoom itripHotelRoom)throws Exception{
        itripHotelRoom.setModifyDate(new Date());
        return itripHotelRoomMapper.modify(itripHotelRoom);
    }

    public Integer removeById(Long id)throws Exception{
        return itripHotelRoomMapper.removeById(id);
    }

    public Page<List<ItripHotelRoom>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = itripHotelRoomMapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripHotelRoom> itripHotelRoomList = itripHotelRoomMapper.getListByMap(param);
        page.setRows(itripHotelRoomList);
        return page;
    }

}
