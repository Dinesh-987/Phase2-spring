package com.fem;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fem.config.PerConfig;
import com.fem.person.Person;

/**
 * Hello world!
 */
public class Test {
    public static void main(String[] args) {
       ApplicationContext context=new AnnotationConfigApplicationContext(PerConfig.class);
       Person p=context.getBean(Person.class);
       Person p2=context.getBean(Person.class);
       int code=p.hashCode();
       System.out.println(p.hashCode());
       System.out.println(p2.hashCode());
       
       p.Stream();
       
    }
}
