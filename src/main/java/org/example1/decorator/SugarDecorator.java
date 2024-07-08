package org.example1.decorator;

import org.example1.beverage.Beverage;

public class SugarDecorator extends BeverageDecorator {

    private static final double DISCOUNT = 0.5;

    public SugarDecorator(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", azúcar";
    }

    @Override
    public double getCost() {
        return applyDiscount(DISCOUNT) + 1;
    }
}
