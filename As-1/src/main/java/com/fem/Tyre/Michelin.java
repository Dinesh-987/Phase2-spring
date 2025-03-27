package com.fem.Tyre;

import org.springframework.stereotype.Component;

@Component
public class Michelin implements Tyre {

	@Override
	public void rotate() {
		System.out.println("The Tyre have good suspension");
		
	}

}
