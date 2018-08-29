package cn.kgc.itrip.service;
import cn.kgc.itrip.model.ItripHotelOrder;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Page;


public interface ItripHotelOrderService {

    public ItripHotelOrder getById(Long id)throws Exception;

    public List<ItripHotelOrder>	getListByMap(Map<String,Object> param)throws Exception;

    public Integer getCountByMap(Map<String,Object> param)throws Exception;

    public Integer save(ItripHotelOrder itripHotelOrder)throws Exception;

    public Integer modify(ItripHotelOrder itripHotelOrder)throws Exception;

    public Integer removeById(Long id)throws Exception;

    public Page<List<ItripHotelOrder>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
