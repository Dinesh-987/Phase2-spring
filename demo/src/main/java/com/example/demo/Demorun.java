package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
@Component
public class Demorun implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("The main Demorun");
	}

	@Override
	public int getOrder() {
		return 5;
	}

}
