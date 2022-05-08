package com.axuan.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author axuan
 * @version 1.0
 * @date 2022/3/22 20:25
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  // 这个不知道为什么要加
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
