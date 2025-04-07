package com.mernvids.sb.requestParamPathVar;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class SampleController {
    @GetMapping("/getUser")
    public String getUserDetails(@RequestParam (name="firstname") String firstname,
//                                 @RequestParam(name="lastname", required = false) String lastname,
                                 @RequestParam(name="lastname", defaultValue = "default last name") String lastname,
                                 @RequestParam(name="age") int age){
        return "First name is:"+firstname+" and last name is:"+lastname+" age is let me double whatever you give:" +(age*2);
    }
    @GetMapping("/hobbies")
    public String getHobbies(@RequestParam List<String> hobby) {
        return "Hobbies: " + String.join(", ", hobby);
    }
    @GetMapping("/user/{id}") // Uses @PathVariable
    public String getUserById(@PathVariable int id) {
        return "User ID: " + id;
    }
}



