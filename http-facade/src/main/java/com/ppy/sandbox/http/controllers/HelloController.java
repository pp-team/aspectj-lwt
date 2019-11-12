package com.ppy.sandbox.http.controllers;

import com.ppy.sandbox.http.controllers.aspect.MethodClass;
import com.ppy.sandbox.http.controllers.factory.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(value = "hello", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloController {

    @Autowired
    private MethodClass aspectTest;

    private static Set<String> visitors = new HashSet();

    @RequestMapping(value = "/say/{toSay}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayHello(@PathVariable String toSay, HttpServletRequest request) {
        aspectTest.method1();
        aspectTest.method2();
        return "I have to repeat : " + toSay;
    }

    @RequestMapping(value = "/remember/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String remember(@PathVariable(required = true) String name, HttpServletRequest request) {
        aspectTest.method1();
        visitors.add(name.toLowerCase());
        return "I will remember you, " + name;
    }

    @RequestMapping(value = "/knock/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String knock(@PathVariable(required = true) String name, HttpServletRequest request) {
        aspectTest.method1();
        if(visitors.contains(name.toLowerCase())) {
            return "I already know you, " + name;
        } else {
            return name + ", you are new person for me";
        }
    }
}
