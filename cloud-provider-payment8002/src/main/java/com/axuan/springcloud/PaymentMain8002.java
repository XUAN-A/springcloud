package com.axuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author axuan
 * @version 1.0
 * @date 2022/3/21 10:47
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {

    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
