package com.mernvids.sb.beanScopeExamples.Singleton;

import jakarta.annotation.PostConstruct;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//Either the above Enum or @Scope("Singleton") both are same only
public class SingletonExample {
    public SingletonExample()
    {
        System.out.println("first singleton class initialized");
    }
    @Autowired
    UserinSingleton user;
    @PostConstruct
    public void init(){
        //"The object is created for this class also you can access the bean of user.. check below you can access hashcodes of both "
        System.out.println("The hashcode of singleton1: "+this.hashCode()+ "  and the hashcode of user is : "+user.hashCode());
    }
    @GetMapping("/fetchUser1")
    public ResponseEntity<String> getUserDetails() {
        System.out.println("fetchUser1 api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
