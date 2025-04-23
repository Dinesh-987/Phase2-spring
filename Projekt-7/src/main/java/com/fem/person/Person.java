package com.fem.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fem.pc.Computer;

@Component
//
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class Person {
	@Autowired
	Computer c;
	
	public void Stream() {
		System.out.println("The person Started Streming");
		c.playing();
		System.out.println("The person Playing GTA VI");
	}

}
