package ${packageName}.service.impl;
import ${packageName}.service.${table.className}Service;
import ${packageName}.mapper.${table.className}Mapper;
import ${packageName}.model.${table.className};
import ${packageName}.common.EmptyUtils;
import ${packageName}.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import ${packageName}.common.Constants;

@Service("${table.firstLowerCaseClassName}Service")
public class ${table.className}ServiceImpl implements ${table.className}Service {

    @Resource
    private ${table.className}Mapper ${table.firstLowerCaseClassName}Mapper;

    public ${table.className} getById(Long ${table.primaryKey})throws Exception{
        return ${table.firstLowerCaseClassName}Mapper.getById(${table.primaryKey});
    }

    public List<${table.className}> getListByMap(Map<String,Object> param)throws Exception{
        return ${table.firstLowerCaseClassName}Mapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return ${table.firstLowerCaseClassName}Mapper.getCountByMap(param);
    }

    public Integer save(${table.className} ${table.firstLowerCaseClassName})throws Exception{
            ${table.firstLowerCaseClassName}.setCreationDate(new Date());
            return ${table.firstLowerCaseClassName}Mapper.save(${table.firstLowerCaseClassName});
    }

    public Integer modify(${table.className} ${table.firstLowerCaseClassName})throws Exception{
        ${table.firstLowerCaseClassName}.setModifyDate(new Date());
        return ${table.firstLowerCaseClassName}Mapper.modify(${table.firstLowerCaseClassName});
    }

    public Integer removeById(Long ${table.primaryKey})throws Exception{
        return ${table.firstLowerCaseClassName}Mapper.removeById(${table.primaryKey});
    }

    public Page<List<${table.className}>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = ${table.firstLowerCaseClassName}Mapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<${table.className}> ${table.firstLowerCaseClassName}List = ${table.firstLowerCaseClassName}Mapper.getListByMap(param);
        page.setRows(${table.firstLowerCaseClassName}List);
        return page;
    }

}
