package cn.kgc.itrip.service;
import cn.kgc.itrip.model.ItripHotel;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Page;


public interface ItripHotelService {

    public ItripHotel getById(Long id)throws Exception;

    public List<ItripHotel>	getListByMap(Map<String,Object> param)throws Exception;

    public Integer getCountByMap(Map<String,Object> param)throws Exception;

    public Integer save(ItripHotel itripHotel)throws Exception;

    public Integer modify(ItripHotel itripHotel)throws Exception;

    public Integer removeById(Long id)throws Exception;

    public Page<List<ItripHotel>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
