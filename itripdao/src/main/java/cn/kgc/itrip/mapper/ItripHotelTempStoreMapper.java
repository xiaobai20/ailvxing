package cn.kgc.itrip.mapper;
import cn.kgc.itrip.model.ItripHotelTempStore;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripHotelTempStoreMapper {

	public ItripHotelTempStore getById(@Param(value = "id") Long id)throws Exception;

	public List<ItripHotelTempStore>	getListByMap(Map<String, Object> param)throws Exception;

	public Integer getCountByMap(Map<String, Object> param)throws Exception;

	public Integer save(ItripHotelTempStore itripHotelTempStore)throws Exception;

	public Integer modify(ItripHotelTempStore itripHotelTempStore)throws Exception;

	public Integer removeById(@Param(value = "id") Long id)throws Exception;

}
