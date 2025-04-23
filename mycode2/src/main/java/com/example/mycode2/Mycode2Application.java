package com.example.mycode2;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mycode2.entity.Course;
import com.example.mycode2.entity.CourseRepo;
import com.example.mycode2.entity.Student;
import com.example.mycode2.entity.StudentRepo;

@SpringBootApplication
public class Mycode2Application implements CommandLineRunner {
	
	
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private CourseRepo courseRepo;

	public static void main(String[] args) {
		SpringApplication.run(Mycode2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Course math = new Course();
		math.setName("Mathematics");
		
		Course science=new Course();
		science.setName("Science");
		
		Course english=new Course();
		english.setName("English");
		
		Student student1=new Student();
		student1.setName("Kanakaraj");
		student1.setCourses(new HashSet<>(Set.of(math,science)));
		Student student2=new Student();
		student2.setName("Tharun");
		student2.setCourses(new HashSet<>(Set.of(science,english)));
		
		studentRepo.saveAll(Set.of(student1,student2));
	}

}
