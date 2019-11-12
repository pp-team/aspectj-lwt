package com.ppy.sandbox.http.controllers;

import com.ppy.sandbox.http.controllers.pojo.PojoClass;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "pojo", produces = MediaType.APPLICATION_JSON_VALUE)
public class PojoController {
    @RequestMapping(value = "/print", produces = MediaType.TEXT_PLAIN_VALUE)
    public String print() {
        new PojoClass(new Date().getTime()).print();
        return "OK";
    }

}
