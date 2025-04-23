package com.example.mycode1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mycode1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
	
	User findByEmail(String email);
	
	List<User> findByAgeGreaterThan(int age);
	
	List<User> findByUsernameContainingIgnoreCase(String keyword);

}
