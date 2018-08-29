package cn.kgc.itrip.service.impl;
import cn.kgc.itrip.service.ItripImageService;
import cn.kgc.itrip.mapper.ItripImageMapper;
import cn.kgc.itrip.model.ItripImage;
import cn.kgc.itrip.common.EmptyUtils;
import cn.kgc.itrip.common.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import cn.kgc.itrip.common.Constants;

@Service("itripImageService")
public class ItripImageServiceImpl implements ItripImageService {

    @Resource
    private ItripImageMapper itripImageMapper;

    public ItripImage getById(Long id)throws Exception{
        return itripImageMapper.getById(id);
    }

    public List<ItripImage> getListByMap(Map<String,Object> param)throws Exception{
        return itripImageMapper.getListByMap(param);
    }

    public Integer getCountByMap(Map<String,Object> param)throws Exception{
        return itripImageMapper.getCountByMap(param);
    }

    public Integer save(ItripImage itripImage)throws Exception{
            itripImage.setCreationDate(new Date());
            return itripImageMapper.save(itripImage);
    }

    public Integer modify(ItripImage itripImage)throws Exception{
        itripImage.setModifyDate(new Date());
        return itripImageMapper.modify(itripImage);
    }

    public Integer removeById(Long id)throws Exception{
        return itripImageMapper.removeById(id);
    }

    public Page<List<ItripImage>> queryPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception{
        Integer total = itripImageMapper.getCountByMap(param);
        pageNo = EmptyUtils.isEmpty(pageNo) ? Constants.DEFAULT_PAGE_NO : pageNo;
        pageSize = EmptyUtils.isEmpty(pageSize) ? Constants.DEFAULT_PAGE_SIZE : pageSize;
        Page page = new Page(pageNo, pageSize, total);
        param.put("beginPos", page.getBeginPos());
        param.put("pageSize", page.getPageSize());
        List<ItripImage> itripImageList = itripImageMapper.getListByMap(param);
        page.setRows(itripImageList);
        return page;
    }

}
