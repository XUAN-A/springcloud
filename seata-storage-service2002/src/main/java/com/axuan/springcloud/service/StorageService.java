package com.axuan.springcloud.service;

/**
 * @author axuan
 * @date 2022/4/24 下午7:49
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
