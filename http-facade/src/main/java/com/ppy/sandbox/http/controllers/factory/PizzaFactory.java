package com.ppy.sandbox.http.controllers.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PizzaFactory {
    static public boolean isCheese = true;

    @Autowired
    private PizzaFourCheese pizzaFourCheese;
    @Autowired
    private PizzaMargarita pizzaMargarrita;

    public Pizza getPizza() {
        return (isCheese) ? pizzaFourCheese : pizzaMargarrita;
    }
}
