package com.lucian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author denglingxiang
 * @date 2022/08/23 08:37
 **/
@EnableEurekaServer
@SpringBootApplication
public class Register {
    public static void main(String[] args) {
        SpringApplication.run(Register.class, args);
    }
}
