package com.fem.seller;

import org.springframework.stereotype.Component;

@Component
public interface Seller {
	public void addproduct();
	
	public void removeproduct();
	
	public Double calculatesales(int unitssold);
}
