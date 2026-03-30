package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findByNameContaining(String name);
	List<Employee> findByDepartment(String dept);

}
