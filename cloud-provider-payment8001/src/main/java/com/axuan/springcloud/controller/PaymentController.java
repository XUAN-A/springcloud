package com.axuan.springcloud.controller;

import com.axuan.springcloud.entities.Payment;
import com.axuan.springcloud.entities.ResultCommon;
import com.axuan.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author axuan
 * @version 1.0
 * @date 2022/3/21 16:40
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        return "hi ,i'am paymentzipkin server fall back，welcome to atguigu，O(∩_∩)O哈哈~";
    }

    @PostMapping("/payment/create")
    public ResultCommon create(@RequestBody  Payment payment) {
        int result = paymentService.create(payment);
        log.info("***插入操作返回结果:" + result);
        if (result > 0) {
            return new ResultCommon(200, "数据库插入成功,返回结果:" + result + ",服务端口:" + serverPort, result);
        } else {
            return new ResultCommon(444, "数据库插入失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public ResultCommon getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("***查询结果:{}" + payment);
        if (payment != null) {
            return new ResultCommon(200, "查询成功,返回结果:" + payment + ",服务端口:" + serverPort, payment);
        } else {
            return new ResultCommon(444, "没有对应记录，查询ID" + id, null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }


    @GetMapping("/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }


    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeOut() {
        System.out.println("*****paymentFeignTimeOut from port: "+serverPort);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serverPort;
    }

}
