package cn.kgc.itrip.service;
import cn.kgc.itrip.model.ItripProductStore;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Page;


public interface ItripProductStoreService {

    public ItripProductStore getById(Long id)throws Exception;

    public List<ItripProductStore>	getListByMap(Map<String,Object> param)throws Exception;

    public Integer getCountByMap(Map<String,Object> param)throws Exception;

    public Integer save(ItripProductStore itripProductStore)throws Exception;

    public Integer modify(ItripProductStore itripProductStore)throws Exception;

    public Integer removeById(Long id)throws Exception;

    public Page<List<ItripProductStore>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
