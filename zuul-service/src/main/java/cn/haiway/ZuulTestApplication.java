package cn.haiway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Haiway  on 2019/4/16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulTestApplication.class,args);
    }
}
