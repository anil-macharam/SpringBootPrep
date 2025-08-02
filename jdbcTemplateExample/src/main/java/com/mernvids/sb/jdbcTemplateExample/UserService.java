package com.mernvids.sb.jdbcTemplateExample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void createTable() {
        userRepository.createTable();
    }

    public void insertUser(String userName, int age) {
        userRepository.insertUser(userName, age);
    }

    public List<User> getUsers() {
        List<User> users = userRepository.getUsers();
        for(User user:users) {
            System.out.println(user.getUserId() + ":" + user.getUserName()
                    + user.getAge());
        }
        return users;
    }
}
