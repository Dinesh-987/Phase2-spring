package com.example.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("${student.info.id}")
	private Integer id;
	@Value("${student.info.name}")
	private String name;
	@Value("${student.info.branch}")
	private String branch;
	@Value("${student.info.college}")
	private String college;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college=college;
	}
}
