package com.mernvids.sb.beanScopeExamples.Prototype;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//
@Component
@ConditionalOnProperty(name = "app.run.prototype", havingValue = "true", matchIfMissing = false)
@RestController
@Scope("prototype")
public class PrototypeExample {
    @Autowired
    User user1;
    @Autowired
    Student student;
    public PrototypeExample()
    {
        System.out.println("prototype example object initialized after hitting the api");
    }
    @PostConstruct
    public void init()
    {
        System.out.println("Hashcode of prototype example is: "+this.hashCode()+" and for student: "+student.hashCode()+ " and for the user: "+user1.hashCode());
    }
    @GetMapping(path = "/hitApi")
    public ResponseEntity<String> getUserDetails() {
        System.out.println("fetch api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

}
