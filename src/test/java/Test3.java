import com.xiechao.spring.redis.entity.Hobby;
import com.xiechao.spring.redis.sender.RedisPublishObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-redis.xml"})
public class Test3 {

    @Autowired
    private RedisPublishObject redisPublishObject;


    @Test
    public void test(){

        redisPublishObject.SendObject("redis",new Hobby("跑步"));
    }


}
