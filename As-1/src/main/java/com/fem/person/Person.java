package com.fem.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fem.v.Vehicle;

@Component
public class Person {

	@Autowired
	Vehicle v;
	
	public void Trip() {
		System.out.println("The person started to trip");
		v.going();
		System.out.println("The trip towards Tirupati");
	}

	
		
	
}
