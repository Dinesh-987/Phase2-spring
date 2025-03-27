package com.fem;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fem.config.PersonConfig;
import com.fem.person.Person;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person p=context.getBean(Person.class);
        p.Trip();
    }
}
