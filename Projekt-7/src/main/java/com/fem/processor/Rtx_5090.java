package com.fem.processor;

import org.springframework.stereotype.Component;

@Component
public class Rtx_5090 implements Processor {

	@Override
	public void play() {
		System.out.println("The processor runs the game smoothly");
	}

	
}
