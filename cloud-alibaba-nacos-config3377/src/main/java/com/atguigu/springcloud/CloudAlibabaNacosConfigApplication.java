package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: linjianhai
 * Date: 2022/5/9 20:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaNacosConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacosConfigApplication.class,args);
    }
}
