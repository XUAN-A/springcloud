package com.axuan.springcloud.service;

import com.axuan.springcloud.entities.CommonResult;
import com.axuan.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author axuan
 * @date 2022/4/23 下午10:19
 */
@Component
public class PaymentFallbackService implements PaymentService{

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
