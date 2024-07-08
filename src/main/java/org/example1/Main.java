package org.example1;

import org.example1.beverage.Beverage;
import org.example1.beverage.GreenTea;
import org.example1.beverage.SimpleCoffee;
import org.example1.decorator.*;

public class Main {

    /*El patron decorator me permite agregar multiples clases que pueden agregar a mi objeto en este caso de tipo
    * Beverage nuevas funcionalidades y estas funcionalidades se pueden complementar unas con otras pero no son dependientes
    entre si.
    * La estructura de los paquetes los definí asi, para separar los decoradores de las implementaciones y que sea mas
    * facil distingir cual es cual*/

    private static void print(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());
    }

    public static void main(String[] args) {
        Beverage simpleCoffee = new SimpleCoffee();
        print(simpleCoffee);

        simpleCoffee = new MilkDecorator(simpleCoffee);
        print(simpleCoffee);

        simpleCoffee = new SugarDecorator(simpleCoffee);
        print(simpleCoffee);

        Beverage greenTea = new GreenTea();
        print(greenTea);

        greenTea = new LemonDecorator(greenTea);
        print(greenTea);

        greenTea = new HoneyDecorator(greenTea);
        print(greenTea);

        Beverage vanillaTea = new VanillaDecorator(new GreenTea());
        print(vanillaTea);

        Beverage coffeeWithHoney = new HoneyDecorator(new SimpleCoffee());
        print(coffeeWithHoney);

    }
}