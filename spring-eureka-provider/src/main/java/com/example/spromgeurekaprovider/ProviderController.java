package com.example.spromgeurekaprovider;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderController {
    //    @Autowired
//    private DiscoveryClient discoveryClient;
    @RequestMapping(value = "/hello")
    public String hello() {
//        discoveryClient.get
//        List<String> services = discoveryClient.getServices();
//        for(String s : services){
//            log.info(s);
//        }
        return "hello spring cloud!";
    }

    @RequestMapping(value = "/nice")
    public String nice() {
//        List<String> services = discoveryClient.getServices();
//        for(String s : services){
//            log.info("gogogo" + s);
//        }
        return "nice to meet you!";
    }
}