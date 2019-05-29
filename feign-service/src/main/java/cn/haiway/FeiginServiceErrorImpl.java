package cn.haiway;

import org.springframework.stereotype.Component;

/**
 * @author Haiway  on 2019/4/16
 */
@Component
public class FeiginServiceErrorImpl implements FeignServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+ name;
    }
}
