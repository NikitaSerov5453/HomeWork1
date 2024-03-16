package org.example.car;

import org.example.car.Audi;
import org.example.car.CarConfig;
import org.example.car.Porsche;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);

        Audi audi = context.getBean(Audi.class);
        Audi audi1 = context.getBean(Audi.class);

        Porsche porsche = context.getBean(Porsche.class);
        Porsche porsche1 = context.getBean(Porsche.class);

        System.out.println("Porsche is " + (porsche == porsche1 ? "Singleton" : "Prototype"));//Porsche is Prototype
        System.out.println("Audi is " + (audi == audi1 ? "Singleton" : "Prototype"));//Audi is Singleton

        context.close();
    }
}