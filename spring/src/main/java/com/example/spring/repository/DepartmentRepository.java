package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
