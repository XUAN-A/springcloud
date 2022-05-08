package com.axuan.springcloud.service.impl;

import com.axuan.springcloud.dao.PaymentDao;
import com.axuan.springcloud.entities.Payment;
import com.axuan.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

/**
 * @author axuan
 * @version 1.0
 * @date 2022/3/21 16:31
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
