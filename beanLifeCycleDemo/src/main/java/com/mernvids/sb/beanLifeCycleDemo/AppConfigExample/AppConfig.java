package com.mernvids.sb.beanLifeCycleDemo.AppConfigExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public User createUser(){
        return new User("abc.com","anil");
//        System.out.println("In our appconfigs file");
    }
}
