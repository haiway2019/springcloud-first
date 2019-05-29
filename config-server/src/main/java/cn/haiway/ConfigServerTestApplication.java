package cn.haiway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Haiway  on 2019/4/16
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerTestApplication.class,args);
    }
}
