package com.example.zipkinserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {
    private final static Logger log = LoggerFactory.getLogger(ZipkinServerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
        log.info("zipkin server start!");
    }

}
