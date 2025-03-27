package com.fem.Tyre;

import org.springframework.stereotype.Component;

@Component
public class Bridgestone implements Tyre {

	@Override
	public void rotate() {
		System.out.println("The tyre have good breaking System");
		
	}

}
