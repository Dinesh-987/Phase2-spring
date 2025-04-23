package com.fem.pojo;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	
	private String name;
	private int year;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	public void displaydetails() {
		System.out.println("The Car is good");
	}
	

}
