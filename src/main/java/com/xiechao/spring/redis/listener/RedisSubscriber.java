package com.xiechao.spring.redis.listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedisSubscriber {
    private static final Logger logger = LoggerFactory.getLogger(RedisSubscriber.class);


    public void handleMessage(String message){
        logger.info("收到消息:" + message);
    }


}
