package com.axuan.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author axuan
 * @version 1.0
 * @date 2022/3/24 15:59
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "--------PaymentFallBackService fall back-paymentInfo_OK, 失败了。。。";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "--------PaymentFallBackService fall back-paymentInfo_TimeOut, 失败了。。。";
    }
}
