package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.Query;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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

    @Autowired
    private DiscoveryClient discoveryClient;

    private static int port;

    static {
        port = new Random().nextInt(100) + 1;
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

    @GetMapping(value = "/timeout")
    public String paymentFeignTimeout(){
        try { TimeUnit.SECONDS.sleep(3); }catch (Exception e) {e.printStackTrace();}
        return String.valueOf(port);
    }


    @GetMapping("/discovery")
    public Object getDiscovery(){
        List<String> services = discoveryClient.getServices();
        for (String service: services) {
            log.info("服务名称：" + service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach(instance ->{
          log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        });
        return this.discoveryClient;

    }

}
