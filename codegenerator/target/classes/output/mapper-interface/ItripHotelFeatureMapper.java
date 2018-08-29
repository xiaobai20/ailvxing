package cn.kgc.itrip.mapper;
import cn.kgc.itrip.model.ItripHotelFeature;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripHotelFeatureMapper {

	public ItripHotelFeature getById(@Param(value = "id") Long id)throws Exception;

	public List<ItripHotelFeature>	getListByMap(Map<String,Object> param)throws Exception;

	public Integer getCountByMap(Map<String,Object> param)throws Exception;

	public Integer save(ItripHotelFeature itripHotelFeature)throws Exception;

	public Integer modify(ItripHotelFeature itripHotelFeature)throws Exception;

	public Integer removeById(@Param(value = "id") Long id)throws Exception;

}
