package com.mernvids.sb.beanScopeExamples.Request;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    public Student()
    {
        System.out.println("Student initialized at the application startup as it is @component and not lazy");
    }
    @Autowired
    User user1;
    @PostConstruct
    public void init()
    {
        System.out.println("Student's obj hashcode:"+this.hashCode()+" and user's hashcode in Student is: "+user1.hashCode());
    }
}
