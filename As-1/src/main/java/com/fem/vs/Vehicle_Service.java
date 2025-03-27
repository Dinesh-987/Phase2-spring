package com.fem.vs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fem.Tyre.Tyre;
import com.fem.speakers.Speaker;

@Component
public class Vehicle_Service {
	@Autowired
	@Qualifier("michelin")
	Tyre t;
	
	@Autowired
	@Qualifier("sony")
	Speaker s;

	public Tyre getT() {
		return t;
	}
	public Speaker getS() {
		return s;
	}
	
}
