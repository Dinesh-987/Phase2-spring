package com.fem.Projekt_9.projekt_9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fem.online.OnlineMarketConfig;
import com.fem.online.OnlineMarketplace;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(OnlineMarketConfig.class);
        OnlineMarketplace omp=context.getBean(OnlineMarketplace.class);
        omp.sell();
    }
}
