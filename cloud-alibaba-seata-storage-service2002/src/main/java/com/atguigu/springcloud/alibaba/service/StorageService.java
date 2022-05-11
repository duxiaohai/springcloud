package com.atguigu.springcloud.alibaba.service;

/**
 * Author: linjianhai
 * Date: 2022/5/11 22:15
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);
}

