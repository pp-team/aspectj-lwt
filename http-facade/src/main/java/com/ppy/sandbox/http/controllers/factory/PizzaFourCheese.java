package com.ppy.sandbox.http.controllers.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cheese")
public class PizzaFourCheese implements Pizza {
    @Override
    public String getName() {
        return this.getClass().getCanonicalName();
    }
}
