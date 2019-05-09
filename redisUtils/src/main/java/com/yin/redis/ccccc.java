package com.yin.redis;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RestController
public class ccccc {
    @Autowired
    private JedisPool jedisPool;
@RequestMapping(value = {"/","index"})
public  String get(){

    return "oookk";
}

}
