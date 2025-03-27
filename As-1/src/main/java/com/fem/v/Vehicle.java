package com.fem.v;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fem.vs.Vehicle_Service;

@Component
public class Vehicle {

	@Autowired
	Vehicle_Service vs;
	
	public void going() {
		System.out.println("The vehicle Started");
		vs.getT().rotate();
		vs.getS().makesound();
		System.out.println("The vehicle is going smoothly");
	}
}
