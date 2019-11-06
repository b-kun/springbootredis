package com.bk.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootredisApplicationTests {
    @Autowired
    RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
    }
    @Test
    public void testRedis(){
        redisTemplate.opsForValue().set("name","zhangqiling");
        String name = (String) redisTemplate.opsForValue().get("name");
        System.out.println(name);

    }
}
