package com.axuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author axuan
 * @date 2022/4/18 上午8:46
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment9002 {
    public static void main(String[] args) {
        SpringApplication.run(Payment9002.class, args);
    }
}
