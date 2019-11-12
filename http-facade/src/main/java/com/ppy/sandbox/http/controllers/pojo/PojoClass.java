package com.ppy.sandbox.http.controllers.pojo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;

@Configurable(autowire = Autowire.BY_NAME, preConstruction = true)
public class PojoClass {

    private Long value;
    @Autowired
    private PojoService pojoService;
    public PojoClass(long v) {
        this.value = v;
    }

    public Long getValue() {
        return value;
    }

    @Autowired
    public void setPojoService(PojoService pojoService) {
        this.pojoService = pojoService;
    }

    public void print() {
        pojoService.print(value);
    }
}

