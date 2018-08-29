package cn.kgc.itrip.mapper;
import cn.kgc.itrip.model.ItripHotelOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripHotelOrderMapper {

	public ItripHotelOrder getById(@Param(value = "id") Long id)throws Exception;

	public List<ItripHotelOrder>	getListByMap(Map<String, Object> param)throws Exception;

	public Integer getCountByMap(Map<String, Object> param)throws Exception;

	public Integer save(ItripHotelOrder itripHotelOrder)throws Exception;

	public Integer modify(ItripHotelOrder itripHotelOrder)throws Exception;

	public Integer removeById(@Param(value = "id") Long id)throws Exception;

}
