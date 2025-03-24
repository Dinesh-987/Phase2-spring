package com.fem.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fem.config.VehicleConfig;
import com.fem.pojo.Vehicle;

public class Main {

	public static void main(String[] args) {
		ApplicationContext Context=new AnnotationConfigApplicationContext(VehicleConfig.class);
		Vehicle vehicle=Context.getBean(Vehicle.class);
		System.out.println("name:"+vehicle.getName());
		System.out.println("Year:"+vehicle.getYear());
	}
}
