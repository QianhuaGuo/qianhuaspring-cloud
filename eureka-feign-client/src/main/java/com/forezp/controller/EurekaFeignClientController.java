package com.forezp.controller;

import com.forezp.server.impl.EurekaClientFeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaFeignClientController {
    @Autowired
    private EurekaClientFeignServer eurekaClientFeignServer;

    @GetMapping("/hi")
    public String sayHi(String name){
        return eurekaClientFeignServer.sayHi(name);
    }
}
