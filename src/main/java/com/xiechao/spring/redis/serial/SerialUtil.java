package com.xiechao.spring.redis.serial;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.util.Assert;

import java.nio.charset.Charset;

public class SerialUtil implements RedisSerializer<Object> {
    static final byte[] EMPTY_ARRAY = new byte[0];
    private final Charset charset;
    private static final Logger logger = LoggerFactory.getLogger(SerialUtil.class);

    public SerialUtil(){
        this(Charset.forName("UTF-8"));
    }
    public SerialUtil(Charset charset) {
        Assert.notNull(charset);
        this.charset = charset;
    }


    @Override
    public byte[] serialize(Object o)  {
        logger.info("使用自定义序列化工具SerialUtil");
        String jsonObject = JSON.toJSONString(o);
        return jsonObject == null ? EMPTY_ARRAY:jsonObject.getBytes(charset);
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        String objectStr = null;
        Object object = null;
        logger.info("使用自定义反序列化工具SerialUtil");
        if(bytes == null){
            return object;
        }
        objectStr = new String(bytes,charset);
        JSONObject jsonObject = JSON.parseObject(objectStr);
        object  = jsonObject;
        return object;  /*此处返回string的意思是应为*/
    }
}
