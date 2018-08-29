package cn.kgc.itrip.service.impl;
import cn.kgc.itrip.service.ItripCommentService;
import cn.kgc.itrip.mapper.ItripCommentMapper;
import cn.kgc.itrip.model.ItripComment;
import cn.kgc.itrip.common.EmptyUtils;
import cn.kgc.itrip.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Constants;

@Service("itripCommentService")
public class ItripCommentServiceImpl implements ItripCommentService {

    @Resource
    private ItripCommentMapper itripCommentMapper;

    public ItripComment getById(Long id)throws Exception{
        return itripCommentMapper.getById(id);
    }

    public List<ItripComment> getListByMap(Map<String,Object> param)throws Exception{
        return itripCommentMapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return itripCommentMapper.getCountByMap(param);
    }

    public Integer save(ItripComment itripComment)throws Exception{
            itripComment.setCreationDate(new Date());
            return itripCommentMapper.save(itripComment);
    }

    public Integer modify(ItripComment itripComment)throws Exception{
        itripComment.setModifyDate(new Date());
        return itripCommentMapper.modify(itripComment);
    }

    public Integer removeById(Long id)throws Exception{
        return itripCommentMapper.removeById(id);
    }

    public Page<List<ItripComment>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = itripCommentMapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripComment> itripCommentList = itripCommentMapper.getListByMap(param);
        page.setRows(itripCommentList);
        return page;
    }

}
