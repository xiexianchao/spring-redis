import com.xiechao.spring.redis.entity.User;
import com.xiechao.spring.redis.sender.RedisPublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-redis.xml"})
public class Test2 {

    @Autowired
    private RedisPublisher redisPublisher;

    @Test
    public void testSendObject(){
        User user = new User();
        user.setUsername("xiechao");
        user.setAge((long) 23);
        redisPublisher.sendMessage("redis",user.toString());

    }
}
