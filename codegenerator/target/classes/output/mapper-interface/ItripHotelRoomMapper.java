package cn.kgc.itrip.mapper;
import cn.kgc.itrip.model.ItripHotelRoom;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripHotelRoomMapper {

	public ItripHotelRoom getById(@Param(value = "id") Long id)throws Exception;

	public List<ItripHotelRoom>	getListByMap(Map<String,Object> param)throws Exception;

	public Integer getCountByMap(Map<String,Object> param)throws Exception;

	public Integer save(ItripHotelRoom itripHotelRoom)throws Exception;

	public Integer modify(ItripHotelRoom itripHotelRoom)throws Exception;

	public Integer removeById(@Param(value = "id") Long id)throws Exception;

}
