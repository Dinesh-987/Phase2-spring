package com.fem.pojo;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Device {
	
	private String name;
	private String model;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public String getModel() {
		return model;
		
	}
	public void setModel(String model) {
		this.model=model;
	}
	
@PostConstruct
	public void initialize() {
	this.name="Lenovo";
	this.model="ideapad";
}
@PreDestroy
	public void deinitialise() {
	System.out.println("This device is off");
}
}
