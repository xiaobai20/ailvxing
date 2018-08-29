package cn.kgc.itrip.service;
import cn.kgc.itrip.model.ItripComment;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Page;


public interface ItripCommentService {

    public ItripComment getById(Long id)throws Exception;

    public List<ItripComment>	getListByMap(Map<String,Object> param)throws Exception;

    public Integer getCountByMap(Map<String,Object> param)throws Exception;

    public Integer save(ItripComment itripComment)throws Exception;

    public Integer modify(ItripComment itripComment)throws Exception;

    public Integer removeById(Long id)throws Exception;

    public Page<List<ItripComment>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
