package com.ppy.sandbox.http.controllers.aspect;

import org.springframework.stereotype.Component;

@Component
public class AnotherMethodClass {
    public void method1() {
        System.out.println("===============>" + this.getClass().getCanonicalName() +"#method1()");
        method2();
    }

    public void method2() {
        System.out.println("===============>" + this.getClass().getCanonicalName() +"#method2()");
    }
}
