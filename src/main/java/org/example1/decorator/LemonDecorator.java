package org.example1.decorator;

import org.example1.beverage.Beverage;

public class LemonDecorator extends BeverageDecorator {

    public LemonDecorator(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", limón";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }
}
