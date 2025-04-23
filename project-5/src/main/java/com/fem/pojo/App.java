package com.fem.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fem.gameconfig.GameConfig;
import com.fem.play.Playstation;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
        Playstation ps=context.getBean(Playstation.class);
        ps.play();
        
        
    }
}
