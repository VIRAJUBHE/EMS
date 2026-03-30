package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo repo;
	
	public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

    public List<Employee> searchByName(String name) {
        return repo.findByNameContaining(name);
    }

    public List<Employee> searchByDepartment(String dept) {
        return repo.findByDepartment(dept);
    }

}
