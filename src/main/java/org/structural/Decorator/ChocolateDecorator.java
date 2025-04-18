package org.structural.Decorator;

public class ChocolateDecorator extends BeverageDecorator {
    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", com chocolate";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.0;
    }
}
