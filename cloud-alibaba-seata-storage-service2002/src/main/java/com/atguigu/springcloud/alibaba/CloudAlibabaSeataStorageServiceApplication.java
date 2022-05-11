package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Author: linjianhai
 * Date: 2022/5/11 22:10
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableDiscoveryClient
public class CloudAlibabaSeataStorageServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaSeataStorageServiceApplication.class,args);
    }
}
