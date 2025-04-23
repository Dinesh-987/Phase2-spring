package com.fem.pay;

import org.springframework.stereotype.Component;

@Component
public class Debit implements Payments {

	@Override
	public void pay() {
		System.out.println("The Debit card is acceptable");
		
	}

}
