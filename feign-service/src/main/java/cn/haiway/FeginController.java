package cn.haiway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Haiway  on 2019/4/16
 */
@RestController
public class FeginController {

    @Autowired
    FeignServiceHi feignServiceHi;

    @GetMapping(value = "/hi")
    private String hi(@RequestParam String name){
        return feignServiceHi.sayHiFromClientOne(name);
    }
}
