package com.mernvids.sb.beanScopeExamples.Singleton;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.run.singleton", havingValue = "true", matchIfMissing = false)
@Lazy
@Scope("singleton")
public class UserinSingleton {
    public UserinSingleton()
    {
        System.out.println("User in Singleton is initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("The hash code of the user object is :"+ this.hashCode());
    }
}
