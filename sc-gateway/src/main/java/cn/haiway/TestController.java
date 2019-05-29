package cn.haiway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Haiway  on 2019/5/9
 */
@RestController
public class TestController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/test")
    public void test(){
        String a = redisTemplate.opsForValue().get("test")+"";
        System.out.println(a);
    }
}
