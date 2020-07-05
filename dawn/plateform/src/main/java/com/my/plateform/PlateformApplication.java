package com.my.plateform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PlateformApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlateformApplication.class, args);
    }

}
