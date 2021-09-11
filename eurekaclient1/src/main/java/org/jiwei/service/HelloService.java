package org.jiwei.service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hiService(String name){
        return "eureka1表示已经收到:"+name;
    }
}
