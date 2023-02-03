package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController  {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/employee")
	public Employee AddEmployee(@RequestBody Employee e) {
		// TODO Auto-generated method stub
		return service.AddEmployee(e);
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return service.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public void getById(@PathVariable int  id) {
		// TODO Auto-generated method stub
		service.getById(id);
	}

}
