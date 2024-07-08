package org.example1.decorator;

import org.example1.beverage.Beverage;

public class VanillaDecorator extends BeverageDecorator {

    public VanillaDecorator(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", vainilla";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.8;
    }
}
