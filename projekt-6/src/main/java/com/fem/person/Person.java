package com.fem.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fem.pay.Payments;



@Component
public class Person {
	@Autowired
	@Qualifier("credit")
	Payments pay;
	
	public void shopping() {
		System.out.println("Payment Processing");
		pay.pay();
		pay.pay();
	}
}
