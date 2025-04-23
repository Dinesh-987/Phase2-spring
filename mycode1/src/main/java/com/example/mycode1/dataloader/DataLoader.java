package com.example.mycode1.dataloader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.mycode1.entity.User;
import com.example.mycode1.repository.UserRepository;

@Component
public class DataLoader implements CommandLineRunner {

	private final UserRepository userRepository;
	
	public DataLoader(UserRepository userRepository) {
		this.userRepository = userRepository;
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("johnDoe", "john@example.com", 25));
        userRepository.save(new User("janeSmith", "jane@example.com", 32));
        System.out.println("Users saved: " + userRepository.count());
	}

}
