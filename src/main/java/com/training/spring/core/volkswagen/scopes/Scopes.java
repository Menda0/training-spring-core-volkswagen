package com.training.spring.core.volkswagen.scopes;

import com.training.spring.core.volkswagen.car.Car;
import com.training.spring.core.volkswagen.car.Garage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


// Exercise
// 1.
// Create a garage that contains 3 cars
// Ford GT, 2 Volkswagen Golf
// Create 2 garages that contains 1 car
// Tesla x

// 2.
// Cars must be prototypes
// Garages must be singleton
// Use collections to create the garages

public class Scopes {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscopes_beans.xml");

        Car golf1 = (Car) applicationContext.getBean("golf");
        Car golf2 = (Car) applicationContext.getBean("golf");

        System.out.println("Is golf1 == golf2:"+ (golf1 == golf2));

        Garage garage = (Garage) applicationContext.getBean("garage");
        System.out.println(garage);
    }
}
