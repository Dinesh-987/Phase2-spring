package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(53)
public class TypeDemo implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("============command line runner======");
		System.out.println("-------From TypeDemo-------");
	}

}
