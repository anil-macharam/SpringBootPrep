package com.mernvids.sb.beanLifeCycleDemo.AppConfigExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class AppConfig {
    public AppConfig()
    {
        System.out.println("inside app config default constructor");
    }
    @Bean
    public User createUser(){
        return new User("abc.com","anil");
    }
//    @Bean
//    public User createUser2(){
//        return new User("another.com","soemthing");
//    }
    /*you can create multiple beans but which one to use wll be defined by using qualifiers or by giving name to our beans*/
}
