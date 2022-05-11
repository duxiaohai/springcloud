package com.atguigu.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * Author: linjianhai
 * Date: 2022/5/7 21:32
 */
public interface PaymentService {

    public String getPaymentOk(Long id);

    public String getPaymentTimeOut(Long id);

    public String paymentCircuitBreaker(Long id);
}
