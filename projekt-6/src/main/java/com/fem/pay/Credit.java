package com.fem.pay;

import org.springframework.stereotype.Component;

@Component
public class Credit implements Payments {

	@Override
	public void pay() {
		 System.out.println("The Credit card is Acceptable");
		
	}

}
