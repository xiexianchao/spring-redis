package com.xiechao.spring.redis.entity;

import java.io.Serializable;

public class Hobby implements Serializable {
    private static final long SerivalVersionId = 1L;
    private String name;

    public Hobby(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
