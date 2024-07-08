package org.example1.decorator;

import org.example1.beverage.Beverage;

public class BeverageDecorator implements Beverage {

    /*En esta clase al ser una clase abstracta puedo definir el llamado estandar de las implementaciones de los metodos
    * o tambien puedo agregar alguna logica por defecto para todos los decoradores*/

    protected final Beverage decoratedBeverage;

    public BeverageDecorator(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedBeverage.getCost();
    }

    /*En esta caso ademas de los metodos implementados de la interfaz se decidio agregar 2 metodos adicionales
    * para aplicar un descuento y para aplicar un impuesto. Logica que pueden compartir todos los decoradores*/
    protected double applyDiscount(double discount) {
        return decoratedBeverage.getCost() - discount;
    }

    protected double applyTax(double taxRate) {
        return decoratedBeverage.getCost() * (1 + taxRate);
    }

}
