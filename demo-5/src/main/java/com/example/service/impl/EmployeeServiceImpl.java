package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;

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
	public Employee getById(int id) {
		Optional<Employee> e=empRepository.findById(id);
		return empRepository.findById(id).get();
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepository.findAll();
	}

}
