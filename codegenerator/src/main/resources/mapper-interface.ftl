package ${packageName}.mapper;
import ${packageName}.model.${table.className};
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ${table.className}Mapper {

	public ${table.className} getById(@Param(value = "${table.primaryKey}") Long ${table.primaryKey})throws Exception;

	public List<${table.className}>	getListByMap(Map<String,Object> param)throws Exception;

	public Integer getCountByMap(Map<String,Object> param)throws Exception;

	public Integer save(${table.className} ${table.firstLowerCaseClassName})throws Exception;

	public Integer modify(${table.className} ${table.firstLowerCaseClassName})throws Exception;

	public Integer removeById(@Param(value = "${table.primaryKey}") Long ${table.primaryKey})throws Exception;

}
