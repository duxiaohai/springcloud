package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * Author: linjianhai
 * Date: 2022/5/8 1:38
 */
@Component
public class PaymentHystrixClientService implements PaymentHystrixService {
    @Override
    public String getPaymentOk(Long id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String getPaymentTimeOut(Long id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
