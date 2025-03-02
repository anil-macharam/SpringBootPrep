package com.mernvids.sb.beanLifeCycleDemo.LifeCycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LifeCycleMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LifeCycleMain.class, args);
        System.out.println("Running LifeCycleMain...");
        context.close();
    }

}
