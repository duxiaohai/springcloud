package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Author: linjianhai
 * Date: 2022/5/7 23:04
 */

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class CloudConsumerFeignHystrixOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignHystrixOrderApplication.class,args);
    }
}
