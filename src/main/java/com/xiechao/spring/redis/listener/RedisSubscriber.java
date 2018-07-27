package com.xiechao.spring.redis.listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedisSubscriber {
    private static final Logger logger = LoggerFactory.getLogger(RedisSubscriber.class);


    public void handleMessage(Object message){
        logger.info("收到消息:" + message + "，其类型为: " + message.getClass());

    }

    public void handleMessage2(String message){
        logger.info("收到消息:" + message + ",其类型为; " + message.getClass());
    }


}
