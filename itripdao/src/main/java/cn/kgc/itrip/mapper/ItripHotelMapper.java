package cn.kgc.itrip.mapper;
import cn.kgc.itrip.model.ItripHotel;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripHotelMapper {

	public ItripHotel getById(@Param(value = "id") Long id)throws Exception;

	public List<ItripHotel>	getListByMap(Map<String, Object> param)throws Exception;

	public Integer getCountByMap(Map<String, Object> param)throws Exception;

	public Integer save(ItripHotel itripHotel)throws Exception;

	public Integer modify(ItripHotel itripHotel)throws Exception;

	public Integer removeById(@Param(value = "id") Long id)throws Exception;

}
