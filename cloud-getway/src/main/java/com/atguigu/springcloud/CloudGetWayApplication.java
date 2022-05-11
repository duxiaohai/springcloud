package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author: linjianhai
 * Date: 2022/5/8 16:14
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGetWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGetWayApplication.class,args);
    }

}
