package cn.kgc.itrip.mapper;
import cn.kgc.itrip.model.ItripLabelDic;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripLabelDicMapper {

	public ItripLabelDic getById(@Param(value = "id") Long id)throws Exception;

	public List<ItripLabelDic>	getListByMap(Map<String, Object> param)throws Exception;

	public Integer getCountByMap(Map<String, Object> param)throws Exception;

	public Integer save(ItripLabelDic itripLabelDic)throws Exception;

	public Integer modify(ItripLabelDic itripLabelDic)throws Exception;

	public Integer removeById(@Param(value = "id") Long id)throws Exception;

}
