package org.example1.beverage;

public class SimpleCoffee implements Beverage {
    @Override
    public String getDescription() {
        return "Café simple";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
