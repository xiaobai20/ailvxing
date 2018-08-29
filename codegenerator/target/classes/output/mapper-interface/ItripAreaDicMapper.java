package cn.kgc.itrip.mapper;
import cn.kgc.itrip.model.ItripAreaDic;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripAreaDicMapper {

	public ItripAreaDic getById(@Param(value = "id") Long id)throws Exception;

	public List<ItripAreaDic>	getListByMap(Map<String,Object> param)throws Exception;

	public Integer getCountByMap(Map<String,Object> param)throws Exception;

	public Integer save(ItripAreaDic itripAreaDic)throws Exception;

	public Integer modify(ItripAreaDic itripAreaDic)throws Exception;

	public Integer removeById(@Param(value = "id") Long id)throws Exception;

}
