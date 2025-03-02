package com.mernvids.sb.beanLifeCycleDemo.AppConfigExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AppConfigMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AppConfigMain.class, args);
        System.out.println("Running AppConfigExampleMain...");
        User user = context.getBean(User.class);
        user.displayUserInfo();
        context.close();
    }
}
