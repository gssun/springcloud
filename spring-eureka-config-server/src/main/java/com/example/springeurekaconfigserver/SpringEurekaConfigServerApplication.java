package com.example.springeurekaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class SpringEurekaConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaConfigServerApplication.class, args);
    }

}
