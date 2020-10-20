package com.forezp.server.impl;

import com.forezp.server.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EurekaClientFeignServer {

    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name){
        return eurekaClientFeign.sayHiFromEurekaClient(name);
    }
}
