package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author: linjianhai
 * Date: 2022/5/5 15:54
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudPaymentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentServiceApplication.class,args);
    }

}
