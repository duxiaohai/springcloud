package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: linjianhai
 * Date: 2022/5/7 23:07
 */
@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")  //全局的
public class OrderHystrixController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/hystrix/ok/{id}")
    public String getPaymentOk(@PathVariable("id") Long id){
        return paymentHystrixService.getPaymentOk(id);
    }

    @GetMapping("/consumer/hystrix/timeout/{id}")
   // @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
 //           @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")})
    @HystrixCommand(commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2500")})
    public String getPaymentTimeOut(@PathVariable("id") Long id){
        //int a = 10/0;
        return paymentHystrixService.getPaymentTimeOut(id);
    }


    //兜底方法
    public String paymentTimeOutFallbackMethod(@PathVariable("id") Long id){
        return "我是消费者80，对付支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,(┬＿┬)";
    }

    //兜底方法
    public String payment_Global_FallbackMethod(){
        return "我是消费者80，对付支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,(┬＿┬)";
    }

}
