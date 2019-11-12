package com.ppy.sandbox.http.controllers.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("non-cheese")
public class PizzaMargarita implements Pizza {

    @Override
    public String getName() {
        return this.getClass().getCanonicalName();
    }
}

