package com.mernvids.sb.beanLifeCycleDemo.AppConfigExample;

import org.springframework.stereotype.Component;

//@Component
public class User {

    String username;
    String email;
    public User(String email, String username) {
        this.email = email;
        this.username = username;
    }
    public User()//This wont be called
    {
        System.out.println("Inside default constructor");
    }
    public void displayUserInfo() {
        System.out.println(email + username);
    }
}
