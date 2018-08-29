import cn.kgc.itrip.common.RedisAPI;
import cn.kgc.itrip.model.ItripUser;
import cn.kgc.itrip.service.ItripUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

//
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext-public.xml")
public class TestSSM {

    @Resource
    private ItripUserService itripUserService;

    @Resource
    private RedisAPI redisAPI;

    @Test
    public void testRedis(){
        redisAPI.set("kgc","123456",60);
    }

    @Test
    public void testSpring() throws Exception {
        ItripUser itripUser=itripUserService.getById(12l);
        System.out.println(itripUser.getUserName());
    }
}
