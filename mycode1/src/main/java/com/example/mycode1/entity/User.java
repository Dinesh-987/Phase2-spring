package com.example.mycode1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	
	private String username;
	private String email;
	private int age;
	
	public User() {
		
	}
	public User(String username,String email,int age) {
		this.username=username;
		this.email=email;
		this.age=age;
	}
}
