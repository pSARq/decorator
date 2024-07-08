package org.example1.beverage;

public class GreenTea implements Beverage {
    @Override
    public String getDescription() {
        return "Té verde";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}
