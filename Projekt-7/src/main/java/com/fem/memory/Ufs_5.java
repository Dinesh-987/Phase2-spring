package com.fem.memory;

import org.springframework.stereotype.Component;

@Component
public class Ufs_5 implements Memory{

	@Override
	public void processing() {
		System.out.println("The memory process 50 FPS");
		
	}

}
