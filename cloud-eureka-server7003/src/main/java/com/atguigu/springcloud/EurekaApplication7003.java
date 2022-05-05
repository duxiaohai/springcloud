package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author: linjianhai
 * Date: 2022/5/5 23:54
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication7003.class,args);
    }
}
