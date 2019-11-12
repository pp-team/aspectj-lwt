package com.ppy.sandbox.http.controllers.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PojoService {
    @Value(value = "${pojoclass.autowiredValue}")
    private String autowiredValue;

    public void print(Long l) {
        System.out.println("====== " + l.shortValue() + ": " + autowiredValue);
    }

}
