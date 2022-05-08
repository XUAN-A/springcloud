package com.axuan.springcloud.controller;

import com.axuan.springcloud.entities.Payment;
import com.axuan.springcloud.entities.ResultCommon;
import com.axuan.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @Value("${server.port}")
    private String serverPort;

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

    @GetMapping("/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
