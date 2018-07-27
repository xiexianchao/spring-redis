package com.xiechao.spring.redis.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisPublishObject {
    private static final Logger logger  = LoggerFactory.getLogger(RedisPublishObject.class);

    @Resource(name = "redisTemplate")
    private RedisTemplate redisTemplate;

    public void SendObject(String channel,Object object){
        logger.info("发送信息：" + object);
        redisTemplate.convertAndSend(channel,object);
    }

}
