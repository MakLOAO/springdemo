package com.mkl.test.redis;

import com.mkl.redis.pojo.Student;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestSpringJedis extends UnitTestBase {

    public TestSpringJedis() {
        super("classpath:spring-data-redis.xml");
    }

    @Test
    public void test() {
        RedisTemplate<String, String> redisTemplate = super.getBean("redisTemplate");
        redisTemplate.opsForValue().set("myspringredis1", "Hello World From Spring");
        System.out.println(redisTemplate.opsForValue().get("myspringredis1"));
    }
}
