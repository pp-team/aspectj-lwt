package com.ppy.sandbox.http.controllers.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MethodClassProxy {

    @Autowired
    MethodClass methodClass;

    public void method1() {
        methodClass.method1();
    }

    public void method2() {
        methodClass.method2();
    }
}
