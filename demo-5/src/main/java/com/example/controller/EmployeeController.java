package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
		@Autowired
		private EmployeeService empService;
	
	@PostMapping("/employee")
	public Employee AddEmployee(@RequestBody Employee e) {
		// TODO Auto-generated method stub
		return empService.AddEmployee(e);
	}

	@GetMapping("/employee/{id}")
	public Employee getById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return empService.getById(id);
		
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empService.getAllEmployees();
	}

}
