package org.jiwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer    // 开启Spring Cloud Config 的服务端功能
@EnableDiscoveryClient
public class ConfigApplication {

// 分别测试master分支和feature分支

    //http://localhost:8087/xx/dev/feature

    //http://localhost:8087/xx/test/master

    //http://localhost:8087/xx/dev/master

    //http://localhost:8087/xx/test   //默认master分支


    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
