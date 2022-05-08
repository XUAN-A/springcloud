package com.axuan.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author axuan
 * @version 1.0
 * @date 2022/3/21 17:04
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    // @LoadBalanced // 使用@LoadBalanced注解赋予RestTemplate负载均衡的能力  //这里就算使用非默认的算法，也要加上这个注解 // 这里如果使用本地的负载均衡器，那就需要注掉这个注解
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
