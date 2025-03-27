package com.fem.speakers;

import org.springframework.stereotype.Component;

@Component
public class Bose implements Speaker {

	@Override
	public void makesound() {
		System.out.println("The Speakers have good base");
	}

	
}
