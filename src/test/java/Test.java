import com.xiechao.spring.redis.sender.RedisPublisher;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.net.URL;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-redis.xml"})
public class Test {

  /*  @Before
    public void init(){
        URL url = ClassLoader.getSystemResource("log4j.properties");
        PropertyConfigurator.configure(url);
    }*/

    @Autowired
    private RedisPublisher redisPublisher;

    @org.junit.Test
    public void test(){
        redisPublisher.sendMessage("redis","i send it");
    }


}
