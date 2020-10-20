package com.forezp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.forezp.server.RibbonService;


@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hi")
    public String hi(@RequestParam(required = false,defaultValue = "forezp") String name){
        return ribbonService.hi(name);
    }
}
