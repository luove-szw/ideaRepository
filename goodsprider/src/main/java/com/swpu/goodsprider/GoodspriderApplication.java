package com.swpu.goodsprider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//能够被注册中心发现
public class GoodspriderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodspriderApplication.class, args);
    }

}
