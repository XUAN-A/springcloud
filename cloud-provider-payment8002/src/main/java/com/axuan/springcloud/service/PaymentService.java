package com.axuan.springcloud.service;

import com.axuan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author axuan
 * @version 1.0
 * @date 2022/3/21 16:31
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
