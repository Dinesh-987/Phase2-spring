package com.fem.online;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fem.seller.Seller;

@Component
public class OnlineMarketplace {

	//@Autowired
	Seller s;
	public OnlineMarketplace(@Qualifier("corporateSeller") Seller s) {
		this.s=s;
	}
	public Seller getS() {
		return s;
	}
	public void sell() {
		System.out.println(s.calculatesales(1000));
		s.addproduct();
		s.removeproduct();
	}
}
