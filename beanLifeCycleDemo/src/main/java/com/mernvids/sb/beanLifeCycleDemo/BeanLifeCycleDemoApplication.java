package com.mernvids.sb.beanLifeCycleDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class BeanLifeCycleDemoApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BeanLifeCycleDemoApplication.class, args);
		System.out.println("Hey there iam from main");
		run.close();
	}
}

//gpt discussion below
/*https://chatgpt.com/c/67c30e14-68a0-800b-951a-ef87ea20ef81*/
