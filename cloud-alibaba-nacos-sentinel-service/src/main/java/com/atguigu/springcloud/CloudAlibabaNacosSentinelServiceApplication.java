package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: linjianhai
 * Date: 2022/5/10 15:47
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaNacosSentinelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacosSentinelServiceApplication.class,args);
    }
}
