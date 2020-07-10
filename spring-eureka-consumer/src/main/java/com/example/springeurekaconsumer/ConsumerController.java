package com.example.springeurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private IHelloService helloService;
    private static final String applicationName = "eureka-provider";
    @RequestMapping(value = "feignRequest")
    public Object feignRequest(){
        String s = helloService.nice();
        return s + " from consumer";
    }

}