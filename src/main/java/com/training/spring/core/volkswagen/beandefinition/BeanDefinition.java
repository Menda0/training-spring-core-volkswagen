package com.training.spring.core.volkswagen.beandefinition;

import com.training.spring.core.volkswagen.car.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Exercise
// Create two cars
// Create a car Tesla X with rain tyres of michelin
// Create a car Volkswagen EOS with slick tyres of continental

public class BeanDefinition {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("beandefenition_beans.xml");
        Car volkswagenGolf = (Car) container.getBean("golf");

        System.out.println(volkswagenGolf);
    }
}
