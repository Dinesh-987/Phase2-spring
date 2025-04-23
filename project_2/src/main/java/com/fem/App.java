package com.fem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fem.config.VehicleConfig;
import com.fem.pojo.Vehicle;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(VehicleConfig.class);
        Vehicle vehicle=context.getBean(Vehicle.class);
        vehicle.setName("Honda");
        vehicle.setYear(2000);
        System.out.println("Name:"+ vehicle.getName());
        System.out.println("Year:"+ vehicle.getYear());
    }
}
