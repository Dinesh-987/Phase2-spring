package com.fem.projekt_6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fem.config.Paymentconfig;
import com.fem.person.Person;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Paymentconfig.class);
    	Person p=context.getBean(Person.class);
    	p.shopping();
    }
}
