package com.fem.mode;

import org.springframework.stereotype.Component;

import com.fem.LM.LearningMode;

@Component
public class Live implements LearningMode{
	
	public void live() {
		System.out.println("The live session starts");
	}

	@Override
	public void startsession() {
		System.out.println("The session has started");

	}

	@Override
	public void endsession() {
		System.out.println("The session has ended");

	}

	@Override
	public void completionpercentage(double lessonscompleted) {
		int total=60;
		double percentage=(lessonscompleted/total)*100;
	}

}
