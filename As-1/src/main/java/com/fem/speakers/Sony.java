package com.fem.speakers;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Speaker {

	@Override
	public void makesound() {
		System.out.println("The Speakers have good vocals");
	}

}
