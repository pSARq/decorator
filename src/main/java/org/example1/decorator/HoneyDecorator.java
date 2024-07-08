package org.example1.decorator;

import org.example1.beverage.Beverage;

public class HoneyDecorator extends BeverageDecorator {

    public HoneyDecorator(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", miel";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
}
