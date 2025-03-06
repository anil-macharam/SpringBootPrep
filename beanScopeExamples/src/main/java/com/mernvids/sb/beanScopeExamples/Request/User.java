package com.mernvids.sb.beanScopeExamples.Request;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
@ConditionalOnProperty(name = "app.run.request", havingValue = "true", matchIfMissing = false)
//New object every time and lazy initialization
public class User {
    public User()
    {
        System.out.println("New User is of request and  its object is initialized with the hashcode : "+ this.hashCode());
    }
}