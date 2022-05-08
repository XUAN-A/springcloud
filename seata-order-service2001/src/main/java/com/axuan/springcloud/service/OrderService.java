package com.axuan.springcloud.service;

import com.axuan.springcloud.domain.Order;

/**
 * @author axuan
 * @date 2022/4/24 下午7:22
 */
public interface OrderService {


    /**
     * 创建订单
     */
    void create(Order order);
}
