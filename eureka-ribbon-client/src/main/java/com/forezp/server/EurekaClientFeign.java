package com.forezp.server;

import com.forezp.config.FeignConfig;
import com.forezp.controller.HystrixHandle;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = HystrixHandle.class)
public interface EurekaClientFeign {
    @GetMapping(value = "/hi")
    String sayHiFromClientEureka (@RequestParam(value = "name") String name);
}
