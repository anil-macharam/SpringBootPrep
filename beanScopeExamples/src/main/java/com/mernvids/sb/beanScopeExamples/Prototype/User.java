package com.mernvids.sb.beanScopeExamples.Prototype;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.run.prototype", havingValue = "true", matchIfMissing = false)
@Scope("prototype")
//New object every time and lazy initialization
public class User {
    public User()
    {
        System.out.println("New User is of prototype and its object is initialized with the hashcode : "+ this.hashCode());
    }
}
