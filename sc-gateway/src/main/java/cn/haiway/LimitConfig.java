package cn.haiway;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * @author Haiway  on 2019/4/30
 */
@Configuration
public class LimitConfig {
    /**
     * 根据IP地址限流
     * @return
     */
    @Bean
    KeyResolver ipResolver(){
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
