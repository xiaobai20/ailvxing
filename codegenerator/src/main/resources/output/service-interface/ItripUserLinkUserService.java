package cn.kgc.itrip.service;
import cn.kgc.itrip.model.ItripUserLinkUser;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Page;


public interface ItripUserLinkUserService {

    public ItripUserLinkUser getById(Long id)throws Exception;

    public List<ItripUserLinkUser>	getListByMap(Map<String,Object> param)throws Exception;

    public Integer getCountByMap(Map<String,Object> param)throws Exception;

    public Integer save(ItripUserLinkUser itripUserLinkUser)throws Exception;

    public Integer modify(ItripUserLinkUser itripUserLinkUser)throws Exception;

    public Integer removeById(Long id)throws Exception;

    public Page<List<ItripUserLinkUser>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
