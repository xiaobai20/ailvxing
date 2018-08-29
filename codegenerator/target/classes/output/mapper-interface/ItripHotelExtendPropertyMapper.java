package cn.kgc.itrip.mapper;
import cn.kgc.itrip.model.ItripHotelExtendProperty;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripHotelExtendPropertyMapper {

	public ItripHotelExtendProperty getById(@Param(value = "id") Long id)throws Exception;

	public List<ItripHotelExtendProperty>	getListByMap(Map<String,Object> param)throws Exception;

	public Integer getCountByMap(Map<String,Object> param)throws Exception;

	public Integer save(ItripHotelExtendProperty itripHotelExtendProperty)throws Exception;

	public Integer modify(ItripHotelExtendProperty itripHotelExtendProperty)throws Exception;

	public Integer removeById(@Param(value = "id") Long id)throws Exception;

}
