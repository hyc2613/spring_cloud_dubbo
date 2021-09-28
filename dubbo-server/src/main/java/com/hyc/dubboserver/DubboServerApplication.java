package com.hyc.dubboserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DubboServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServerApplication.class, args);
    }

}
