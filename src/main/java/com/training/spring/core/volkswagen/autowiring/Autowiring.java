package com.training.spring.core.volkswagen.autowiring;

import com.training.spring.core.volkswagen.car.Car;
import com.training.spring.core.volkswagen.car.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiring {

    // Exercise
    // Create 2 volkswagen golf that start playing radio musics on init
    // Create 1 volkswagen polo that starts playing radio musics on init
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("autowiring_beans.xml");

        Engine engine1 = (Engine) container.getBean("engine");
        Engine engine2 = container.getBean(Engine.class);

        System.out.println("Engine1: "+engine1);
        System.out.println("Engine2: "+engine2);

        Car teslaX = (Car) container.getBean("teslax");
        System.out.println("Tesla x: " +teslaX);

        Car teslaY = (Car) container.getBean("teslay");
        System.out.println("Tesla y: "+teslaY);

        Car teslaS = (Car) container.getBean("teslas");
        System.out.println("Tesla s: "+teslaS);
    }
}
