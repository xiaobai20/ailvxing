package ${packageName}.service;
import ${packageName}.model.${table.className};
import java.util.List;
import java.util.Map;
import ${packageName}.common.Page;


public interface ${table.className}Service {

    public ${table.className} getById(Long ${table.primaryKey})throws Exception;

    public List<${table.className}>	getListByMap(Map<String,Object> param)throws Exception;

    public Integer getCountByMap(Map<String,Object> param)throws Exception;

    public Integer save(${table.className} ${table.firstLowerCaseClassName})throws Exception;

    public Integer modify(${table.className} ${table.firstLowerCaseClassName})throws Exception;

    public Integer removeById(Long ${table.primaryKey})throws Exception;

    public Page<List<${table.className}>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
