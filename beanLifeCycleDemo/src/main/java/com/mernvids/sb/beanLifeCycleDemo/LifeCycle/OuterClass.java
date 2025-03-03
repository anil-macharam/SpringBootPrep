package com.mernvids.sb.beanLifeCycleDemo.LifeCycle;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Lazy
@Component
public class OuterClass {
    String nameInOuterClass="Anil";
    public OuterClass()
    {
        System.out.println("Inside Outerclass default construcotr");
    }
    public void method1()
    {
        System.out.println("Printing nameInOuterClass  "+nameInOuterClass);
        System.out.println("Its not lazy by the way!");
    }
}
