package com.mernvids.sb.beanLifeCycleDemo.AppConfigExample;

import org.springframework.stereotype.Component;

@Component
public class User {

    String username;
    String email;
    public User(String email, String username) {
        this.email = email;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public User()
//    {
//        System.out.println("Inside default constructor");
//    }
    public void displayUserInfo() {
        System.out.println(getEmail()+getUsername());
    }
}
