package com.forezp.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConf {

    @Bean
    @LoadBalanced
    public RestTemplate getRTemplate(){
        return new RestTemplate();
    }
}
