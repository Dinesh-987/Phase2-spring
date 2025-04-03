package com.fem.LM;

import org.springframework.stereotype.Component;

import com.fem.mode.video;

@Component
public interface LearningMode {
	
	
	
	
	public void startsession() ;
		
	public void endsession();
	
	public void completionpercentage(double lessonscompleted);

	

}
