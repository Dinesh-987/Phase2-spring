package com.fem.pc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fem.game.Gameplay;

@Component
public class Computer {

	@Autowired
	Gameplay g;
	
	public void playing() {
		System.out.println("The game was Started");
		g.getP().play();
		g.getM().processing();
		System.out.println("The game was running");
	}
}
