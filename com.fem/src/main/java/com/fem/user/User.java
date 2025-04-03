package com.fem.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fem.EL.E_learning;

@Component
public class User {

	@Autowired
	E_learning el;
	
	public void watch() {
		el.getLM().completionpercentage(45);
		el.getLM().startsession();
		el.getLM().endsession();
	}
	public void quiz() {
		System.out.println("The user switched to Quiz");
	}
}
