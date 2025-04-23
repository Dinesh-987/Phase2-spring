package com.fem.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fem.Car.Car;

@Configuration
@ComponentScan("com.fem")
public class Carconfig {
@Bean

public Car car1() {
	Car car1=new Car();
	car1.setName("Hyundai");
	car1.setRange(23);
	car1.setLitre(15);
	return car1;
}
@Bean
@Primary
public Car car2() {
	Car car2=new Car();
	car2.setName("Toyota");
	car2.setRange(24);
	car2.setLitre(17);
	return car2;
}
	
}
