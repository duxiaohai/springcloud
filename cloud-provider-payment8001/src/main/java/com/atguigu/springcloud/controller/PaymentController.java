package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.Query;
import java.lang.management.ManagementFactory;
import java.util.Random;
import java.util.Set;

/**
 * Author: linjianhai
 * Date: 2022/5/5 17:11
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    private static int port;

    static {
        port = new Random().nextInt(10) + 1;
    }


    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        log.info("添加数据：" + i);
        if (i > 0){
            return new CommonResult(200,"插入数据成功" + port, i);
        }else {
            return new CommonResult(444,"插入数据失败", null);
        }
    }

    @GetMapping("/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) throws Exception{
        Payment payment = paymentService.getPaymentById(id);
        log.info("获取数据:" + payment);
        return new CommonResult(200,"获取数据成功" + port,payment);

    }

}
