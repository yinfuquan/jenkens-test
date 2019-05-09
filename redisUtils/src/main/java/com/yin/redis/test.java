package com.yin.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class test {
    @Autowired
    private JedisPool jedisPool;
    public  Jedis  t(){
        Jedis resource = jedisPool.getResource();
        int numActive = jedisPool.getNumActive();
        System.out.println(numActive);
        return  resource;
    }
}
