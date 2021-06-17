package com.training.spring.core.volkswagen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create application container
        ApplicationContext container = new ClassPathXmlApplicationContext("helloworld_beans.xml");

        // Get bean from container
        String beanId = "helloworld";
        Helloworld bean = (Helloworld) container.getBean(beanId);

        System.out.println("Hello: "+bean.getMessage());
    }
}
