package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);

        Car c = container.getBean(Car.class);
        Person p = container.getBean(Person.class);

        System.out.println(p.getName());
        System.out.println(c.getMake());
        System.out.println(p.getCar()); //returns null when not wired to achieve has a relation between Car-Person
        //2 ways to solve
    }
}
