package cn.kgc.itrip.mapper;
import cn.kgc.itrip.model.ItripUserLinkUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripUserLinkUserMapper {

	public ItripUserLinkUser getById(@Param(value = "id") Long id)throws Exception;

	public List<ItripUserLinkUser>	getListByMap(Map<String, Object> param)throws Exception;

	public Integer getCountByMap(Map<String, Object> param)throws Exception;

	public Integer save(ItripUserLinkUser itripUserLinkUser)throws Exception;

	public Integer modify(ItripUserLinkUser itripUserLinkUser)throws Exception;

	public Integer removeById(@Param(value = "id") Long id)throws Exception;

}
