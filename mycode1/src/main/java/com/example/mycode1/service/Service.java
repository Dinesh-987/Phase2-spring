package com.example.mycode1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.mycode1.Mycode1Application;
import com.example.mycode1.entity.User;
import com.example.mycode1.repository.UserRepository;

@org.springframework.stereotype.Service
public class Service {

    private final Mycode1Application mycode1Application;

	@Autowired
	
	private UserRepository userRepository;

    Service(Mycode1Application mycode1Application) {
        this.mycode1Application = mycode1Application;
    }
	
	public void runExamples() {
		userRepository.save(new User("johnDoe","john@example.com",25));
		userRepository.save(new User("janesmith","jane@example.com",32));
		
		User user1 = userRepository.findByUsername("johnDoe");
		System.out.println("Found user:"+user1.getEmail());
		
		List<User> oldUsers=userRepository.findByAgeGreaterThan(30);
		oldUsers.forEach(u -> System.out.println("older user:"+u.getUsername()));
		
		List<User> similarusers=userRepository.findByUsernameContainingIgnoreCase("doe");
		similarusers.forEach(u -> System.out.println("Matched:"+u.getUsername()));
	}
}
