package org.structural.Decorator;

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", com leite";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 1.5;
    }
}

