package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public Employee AddEmployee(Employee e) {
		// TODO Auto-generated method stub
		return empRepository.save(e);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepository.findAll();
	}

	@Override
	public void getById(int id) {
		// TODO Auto-generated method stub
		empRepository.getById(id);

	}

}
