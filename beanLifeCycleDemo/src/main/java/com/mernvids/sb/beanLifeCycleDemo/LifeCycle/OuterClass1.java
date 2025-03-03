package com.mernvids.sb.beanLifeCycleDemo.LifeCycle;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OuterClass1 {

    @Autowired
    OuterClass a;

//    public void usingOuterclassMethod()
//    {
//        a.method1();
//    }
    @PostConstruct
    public void initialize(){
        System.out.println("some Post construction is done");
        a.method1();
    }

    public OuterClass1()
    {
        System.out.println("Inside default constructor of outerclass1");
    }

    @PreDestroy
    public void closing()
    {
        System.out.println("Statement before pre destroy");
    }
}
