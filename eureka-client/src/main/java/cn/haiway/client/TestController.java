package cn.haiway.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Haiway  on 2019/4/16
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "hiError")
    private String sayHello(@RequestParam(value = "name", defaultValue = "haiway") String name){
        System.out.println("request");
        return "hi " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/ask")
    @HystrixCommand(fallbackMethod = "hiError")
    private String ask(@RequestParam(value = "content") String content){
        System.out.println("content:"+content);
        return "我不知道你在說什麽" ;
    }

    @RequestMapping("/list")
    @HystrixCommand(fallbackMethod = "hiError")
    private List<Map<String,Object>> getPersons(@RequestParam(value = "name", defaultValue = "haiway") String name){
        System.out.println("request");

        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> mp = new HashMap<>();
        mp.put("dissname","諸葛亮");
        mp.put("dissid","zhugeliang");
        mp.put("phone","18312345678");
        mp.put("imgurl","http://static.bbs.9wee.com/attachment/forum/201306/07/210751qbp4p4c5yzhhbpym.jpg");
        mp.put("location","蜀国");
        mp.put("album","http://src.zhigame.com/news/20130123/2013012310413268.jpg");
        mp.put("source","通过搜索手机号添加");
        mp.put("summary","点击发送消息");
        mp.put("unread","");
        mp.put("time","08:25");
        list.add(mp);
System.out.println(list);
        return list;
    }

    @RequestMapping("/foo")
    @HystrixCommand(fallbackMethod = "hiError")
    private String foo(String foo){
        return "hi " + foo + " ,i am from port:" + port;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
