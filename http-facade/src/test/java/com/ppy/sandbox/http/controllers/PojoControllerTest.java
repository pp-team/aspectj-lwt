package com.ppy.sandbox.http.controllers;

import com.ppy.sandbox.HttpApplication;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class PojoControllerTest {

    private static ApplicationContext appContext;

    @BeforeClass
    public static void setUp() {
        if (appContext == null) {
            appContext = SpringApplication.run(HttpApplication.class);
        }
    }

    @Test
    public void print() {
        System.out.println("I am here.");
    }
}