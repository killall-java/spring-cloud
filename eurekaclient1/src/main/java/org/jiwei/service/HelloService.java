package org.jiwei.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    Logger LOGGER = LoggerFactory.getLogger(HelloService.class);
    public String hiService(String name){
        LOGGER.info("eureka1表示已经收到:"+name);
        return "eureka1表示已经收到:"+name;
    }
}
