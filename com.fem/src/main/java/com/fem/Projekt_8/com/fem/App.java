package com.fem.Projekt_8.com.fem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fem.config.E_LearnConfig;
import com.fem.user.User;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(E_LearnConfig.class);
       User u =context.getBean(User.class);
       u.watch();
       u.quiz();
    }
}
