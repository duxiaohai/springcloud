package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: linjianhai
 * Date: 2022/5/9 18:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaNacosProviderPaymentApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacosProviderPaymentApplication9001.class,args);
    }
}
