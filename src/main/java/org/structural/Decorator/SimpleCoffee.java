package org.structural.Decorator;

public class SimpleCoffee implements Beverage {
    @Override
    public String getDescription() {
        return "Café simples";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}

