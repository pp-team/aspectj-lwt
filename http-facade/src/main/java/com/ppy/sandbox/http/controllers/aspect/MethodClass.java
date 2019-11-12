package com.ppy.sandbox.http.controllers.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MethodClass {

    @Autowired
    private AnotherMethodClass anotherMethodClass;

    @Autowired
    MethodClassProxy methodClassProxy;

    public void method1() {
        System.out.println("===============>" + this.getClass().getCanonicalName() +"#method1()");
        methodClassProxy.method2();
//        anotherMethodClass.method1();
    }

    public void method2() {
        System.out.println("===============>" + this.getClass().getCanonicalName() +"#method2()");
    }
}
