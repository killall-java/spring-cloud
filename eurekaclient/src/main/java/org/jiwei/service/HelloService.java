package org.jiwei.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloService {
    public String hiService(String name){
        return "eureka表示已经收到:"+name;
    }
}
