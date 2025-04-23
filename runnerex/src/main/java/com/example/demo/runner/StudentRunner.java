package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.pojo.Student;

@Component
public class StudentRunner implements CommandLineRunner {
     @Autowired
	 private Student stu;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(stu.getBranch());

	}

}
