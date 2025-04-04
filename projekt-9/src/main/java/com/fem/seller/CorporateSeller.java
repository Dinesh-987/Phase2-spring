package com.fem.seller;

import org.springframework.stereotype.Component;

@Component
public class CorporateSeller implements Seller{
	public void corporate() {
		System.out.println("The products were sold by corporate");
	}
	@Override
	public void addproduct() {
		System.out.println("Add the cable");
		
	}

	@Override
	public void removeproduct() {
		System.out.println("Remove the adapter");
		
	}

	@Override
	public Double calculatesales(int unitssold) {
		return unitssold*30.0;
		
		
	}

}
