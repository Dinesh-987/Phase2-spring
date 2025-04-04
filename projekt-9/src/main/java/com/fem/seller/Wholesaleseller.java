package com.fem.seller;

import org.springframework.stereotype.Component;

@Component
public class Wholesaleseller implements Seller {
	
	public void wholesale() {
		System.out.println("The products were sold wholesale");
	}
	
	@Override
	public void addproduct() {
		System.out.println("Add bottle");
	}

	@Override
	public void removeproduct() {
		System.out.println("Remove flasks");
	}

	@Override
	public Double calculatesales(int unitssold) {
		return unitssold*20.0;
		 
		
	}
	
}
