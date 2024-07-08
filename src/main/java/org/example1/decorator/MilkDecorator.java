package org.example1.decorator;

import org.example1.beverage.Beverage;

public class MilkDecorator extends BeverageDecorator {

    private static final double TAX = 0.1;

    public MilkDecorator(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    /*En este decorador en particular se decidio usar el objeto que posee la clase abstracta y desde este objeto hacer
    * el llamado a su metodo para obtener la descripcion. Esto en caso de que quisieramos evitar una logica que
    * posee la el metodo getDescription de la clase abstracta. Ya para los otros decoradores si se usa el metodo
    * que se declara en la clase abstracta*/
    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription() + ", leche";
    }

    @Override
    public double getCost() {
        return applyTax(TAX) + 1.5;
    }
}
