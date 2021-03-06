package cn.jboost.springboot.redis.sentinel.test;

import cn.jboost.springboot.redis.sentinel.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisService redisService;

    @Test
    public void testCache() {
        redisService.set("site", "blog.jboost.cn");
        System.out.println(redisService.get("site"));
    }
}
