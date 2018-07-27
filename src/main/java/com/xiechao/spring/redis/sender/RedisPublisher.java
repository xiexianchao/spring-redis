package com.xiechao.spring.redis.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisPublisher {
    private static final Logger logger = LoggerFactory.getLogger(RedisPublisher.class);

  //  @Autowired
    @Resource(name="stringRedisTemplate")
    private RedisTemplate redisTemplate;

    public void sendMessage(String channle,String message){

        logger.info("发布消息:" + message);
        redisTemplate.convertAndSend(channle,message);
        logger.info("发布成功");
    }
}
