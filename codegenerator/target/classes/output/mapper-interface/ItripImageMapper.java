package cn.kgc.itrip.mapper;
import cn.kgc.itrip.model.ItripImage;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripImageMapper {

	public ItripImage getById(@Param(value = "id") Long id)throws Exception;

	public List<ItripImage>	getListByMap(Map<String,Object> param)throws Exception;

	public Integer getCountByMap(Map<String,Object> param)throws Exception;

	public Integer save(ItripImage itripImage)throws Exception;

	public Integer modify(ItripImage itripImage)throws Exception;

	public Integer removeById(@Param(value = "id") Long id)throws Exception;

}
