package com.example.springgateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    @RequestMapping(value = "/hello111")
//    public String hello() {
//        return "hello spring cloud,this is gateway for test!";
//    }

    @RequestMapping(value = "/nice")
    public String nice() {
        return "nice to meet you,this is gateway for test!";
    }
}