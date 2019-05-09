package com.yin.redis;

import com.yin.redis.config.RedisConfig;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@SpringBootApplication
@EnableConfigurationProperties(RedisConfig.class)
public class RedisUtilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisUtilsApplication.class, args);
    }

}
