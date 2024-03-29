package com.jyk.gulimail.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GulimailWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimailWareApplication.class,args);
    }
}
