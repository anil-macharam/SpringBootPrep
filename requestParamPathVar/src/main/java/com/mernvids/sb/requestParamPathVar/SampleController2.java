package com.mernvids.sb.requestParamPathVar;

import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class SampleController2 {
    List<User> userList = new ArrayList<>();
    @PostMapping("/create")
        public String addUser(@RequestBody User user)
        {
            userList.add(user);
            return "User Created" +  user.getName() + "age:" +user.getAge();
        }
    @GetMapping("/fetch")
    public ResponseEntity<User> getUser(@RequestParam String namefromurl) {
        for(User user : userList)
        {
            if(user.getName().equalsIgnoreCase(namefromurl))
            {
                return ResponseEntity.ok(user);
            }
        }
        return ResponseEntity.status(404).body(null);
    }
    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userList);  // Just return the list (empty or filled)
    }
}

