package cn.kgc.itrip.service;
import cn.kgc.itrip.model.ItripHotelTradingArea;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Page;


public interface ItripHotelTradingAreaService {

    public ItripHotelTradingArea getById(Long id)throws Exception;

    public List<ItripHotelTradingArea>	getListByMap(Map<String,Object> param)throws Exception;

    public Integer getCountByMap(Map<String,Object> param)throws Exception;

    public Integer save(ItripHotelTradingArea itripHotelTradingArea)throws Exception;

    public Integer modify(ItripHotelTradingArea itripHotelTradingArea)throws Exception;

    public Integer removeById(Long id)throws Exception;

    public Page<List<ItripHotelTradingArea>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
