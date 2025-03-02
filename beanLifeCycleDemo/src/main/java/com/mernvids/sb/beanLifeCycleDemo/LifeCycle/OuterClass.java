package com.mernvids.sb.beanLifeCycleDemo.LifeCycle;

import org.springframework.stereotype.Component;

//@Lazy
@Component
public class OuterClass {
    String nameInOuterClass="Anil";
    public void method1()
    {
        System.out.println("Printing nameInOuterClass  "+nameInOuterClass);
        System.out.println("Its not lazy by the way!");
    }
}
