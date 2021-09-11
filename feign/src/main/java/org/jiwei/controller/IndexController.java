package org.jiwei.controller;

import org.jiwei.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    FeignService feignService;

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name){
        return feignService.hi(name);
    }
}
