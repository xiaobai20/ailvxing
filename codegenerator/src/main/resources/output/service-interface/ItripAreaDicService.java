package cn.kgc.itrip.service;
import cn.kgc.itrip.model.ItripAreaDic;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Page;


public interface ItripAreaDicService {

    public ItripAreaDic getById(Long id)throws Exception;

    public List<ItripAreaDic>	getListByMap(Map<String,Object> param)throws Exception;

    public Integer getCountByMap(Map<String,Object> param)throws Exception;

    public Integer save(ItripAreaDic itripAreaDic)throws Exception;

    public Integer modify(ItripAreaDic itripAreaDic)throws Exception;

    public Integer removeById(Long id)throws Exception;

    public Page<List<ItripAreaDic>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
