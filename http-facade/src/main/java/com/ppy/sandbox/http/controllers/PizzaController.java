package com.ppy.sandbox.http.controllers;

import com.ppy.sandbox.http.controllers.factory.Pizza;
import com.ppy.sandbox.http.controllers.factory.PizzaFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pizza", produces = MediaType.APPLICATION_JSON_VALUE)
public class PizzaController {

    @Autowired
    private Pizza pizza;

    @RequestMapping(value = "/{isCheese}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getPizza(@PathVariable(value = "isCheese", required = false) boolean isCheese) {
        PizzaFactory.isCheese = isCheese;
        return pizza.getName();
    }
}
