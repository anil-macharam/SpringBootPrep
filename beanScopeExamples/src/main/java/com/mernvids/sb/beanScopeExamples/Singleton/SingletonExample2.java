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
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
////Either the above Enum or @Scope("Singleton") both are same only
public class SingletonExample2 {
    public SingletonExample2()
    {
        System.out.println("Second singleton class initialized");
    }
    @Autowired
    UserinSingleton user;
    @PostConstruct
    public void init(){
        //"The object is created for this class also you can access the bean of user.. check below you can access hashcodes of both "
        //You can observe the object is created only once and the same is used in both the classes... you can refer the output and the hashcodes will be same for user in both the singletonexample classes
        System.out.println("The hashcode of singleton2: "+this.hashCode()+ "  and the hashcode of user is : "+user.hashCode());
    }
    @GetMapping("/fetchUser2")
    public ResponseEntity<String> getUserDetails() {
        System.out.println("fetchUser2 api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
