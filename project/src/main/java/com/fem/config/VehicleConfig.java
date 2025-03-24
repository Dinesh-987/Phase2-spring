package com.fem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fem.pojo.Vehicle;

@Configuration
public class VehicleConfig {
	
	@Bean
	public Vehicle vehicle1() {
		Vehicle vehicle = new Vehicle("Tata",2025);
		return vehicle;
	}
	

}
