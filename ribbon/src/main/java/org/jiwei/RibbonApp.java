package org.jiwei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@ComponentScan(basePackages = {"org.jiwei.ribbon.controller","org.jiwei.ribbon.service"})
public class RibbonApp {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    public static void main( String[] args )
    {
        SpringApplication.run(RibbonApp.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return restTemplateBuilder.build();
    }
}
