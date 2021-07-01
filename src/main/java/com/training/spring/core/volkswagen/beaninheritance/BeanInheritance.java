package com.training.spring.core.volkswagen.beaninheritance;

import com.training.spring.core.volkswagen.car.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


// Exercise
// Create a winter electric car
// Create a summer diesel car
// Create a winter diesel car
// Create a porche caynem summer diesel
// Create a bmw x3 winter diesel

public class BeanInheritance {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("beaninheritance_beans.xml");

        Car teslax = (Car) container.getBean("teslaX");

        System.out.println(teslax);

        container.getBean("summerElectricBlueprint");
    }
}
