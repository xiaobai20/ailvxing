package cn.kgc.itrip.service;
import cn.kgc.itrip.model.ItripUser;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Page;


public interface ItripUserService {

    public ItripUser getById(Long id)throws Exception;

    public List<ItripUser>	getListByMap(Map<String, Object> param)throws Exception;

    public Integer getCountByMap(Map<String, Object> param)throws Exception;

    public Integer save(ItripUser itripUser)throws Exception;

    public Integer modify(ItripUser itripUser)throws Exception;

    public Integer removeById(Long id)throws Exception;

    public Page<List<ItripUser>> queryPageByMap(Map<String, Object> param, Integer pageNo, Integer pageSize)throws Exception;
//登录
    public ItripUser login(String userCode,String userPassword) throws Exception;
    //根据
    public ItripUser findByUserCode(String userCode) throws Exception;
}
