package com.fem.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fem.Car.Car;
import com.fem.Config.Carconfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Carconfig.class);
        Person p1=context.getBean(Person.class);
        p1.drive();

    }
}
