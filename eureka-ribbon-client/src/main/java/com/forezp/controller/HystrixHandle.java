package com.forezp.controller;

import com.forezp.server.EurekaClientFeign;
import org.springframework.stereotype.Component;

@Component
public class HystrixHandle implements EurekaClientFeign {

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi"+name+",sorry error";
    }
}
