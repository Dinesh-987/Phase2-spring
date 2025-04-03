package com.fem.mode;

import org.springframework.stereotype.Component;

import com.fem.LM.LearningMode;

@Component
public class InteractiveQuiz implements LearningMode {
	
	public void quiz() {
		System.out.println("The Quiz starts click here");
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
