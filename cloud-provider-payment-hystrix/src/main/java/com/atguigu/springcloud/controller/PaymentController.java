package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: linjianhai
 * Date: 2022/5/7 21:31
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String getPaymentOk(@PathVariable("id") Long id){
        String paymentOk = paymentService.getPaymentOk(id);
        log.info("*******result:"+paymentOk);
        return paymentOk;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String getPaymentTimeOut(@PathVariable("id") Long id){
        String paymentTimeOut = paymentService.getPaymentTimeOut(id);
        log.info("*******result:"+paymentTimeOut);
        return paymentTimeOut;
    }

    @GetMapping("/payment/hystrix/out/{id}")
    public String getPaymentCircuitBreaker(@PathVariable("id") Long id){
        String paymentTimeOut = paymentService.paymentCircuitBreaker(id);
        log.info("*******result:"+paymentTimeOut);
        return paymentTimeOut;
    }


}
