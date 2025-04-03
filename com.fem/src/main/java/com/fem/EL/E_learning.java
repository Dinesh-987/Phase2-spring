package com.fem.EL;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fem.LM.LearningMode;

@Component
public class E_learning {
	
	
	LearningMode LM;
	
	public E_learning(@Qualifier("live") LearningMode lM) {
		this.LM=lM;
	}
		public LearningMode getLM() {
			return LM;
		}
}
