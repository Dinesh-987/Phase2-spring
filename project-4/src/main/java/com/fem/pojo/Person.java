package com.fem.pojo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fem.Car.Car;

@Component
public class Person {
	String name="rajiv";
	int id=123;
	Car car;
	Person(@Qualifier("car1") Car car){
		this.car=car;
	}
	public void drive() {
		System.out.println("Car going HYD");
		System.out.println("person name:"+name);
		System.out.println("Car"+car.getName());
		System.out.println("Car"+car.getRange());
		System.out.println("Car"+car.getLitre());
	}
	
}
