package com.atguigu.springcloud;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Author: linjianhai
 * Date: 2022/5/7 21:30
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class CloudProviderPaymentHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPaymentHystrixApplication.class,args);
    }
}
