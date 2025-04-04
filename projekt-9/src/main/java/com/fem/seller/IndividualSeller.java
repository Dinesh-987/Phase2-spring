package com.fem.seller;

import org.springframework.stereotype.Component;

@Component
public class IndividualSeller implements Seller {

	public void Individual() {
		System.out.println("The products were sold individually");
	}
	@Override
	public void addproduct() {
		System.out.println("Add covers");
	}

	@Override
	public void removeproduct() {
		System.out.println("Remove boxes");
	}

	@Override
	public Double calculatesales(int unitssold) {
		return unitssold*40.0;
		
	}

}
