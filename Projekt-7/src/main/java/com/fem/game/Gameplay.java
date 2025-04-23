package com.fem.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fem.memory.Memory;
import com.fem.processor.Processor;

@Component
public  class Gameplay {
	
	Processor p;
	Memory m;
	
	public Gameplay(@Qualifier("rtx_5090") Processor p, @Qualifier("ufs_5") Memory m){
		this.p=p;
		this.m=m;
	}


	 
	public Processor getP() {
		return p;
	}
	public Memory getM() {
		return m;
	}
}
