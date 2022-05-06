package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Author: linjianhai
 * Date: 2022/5/7 0:04
 */
@SpringBootApplication
//@EnableDiscoveryClient
@EnableFeignClients
public class CloudConsumerFeignOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignOrderApplication.class,args);
    }
}
