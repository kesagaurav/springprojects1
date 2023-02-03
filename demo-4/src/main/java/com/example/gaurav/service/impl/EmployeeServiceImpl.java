package com.example.gaurav.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gaurav.model.Employee;
import com.example.gaurav.model.EmployeeDetails;
import com.example.gaurav.repository.EmployeeRepository;
import com.example.gaurav.service.EmployeeService;

@Service(value = "employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public Employee AddEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println(e);
		
		return empRepository.save(e);
	}

	@Override
	public void getById(int id) {
		// TODO Auto-generated method stub
		empRepository.getById(id);

	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepository.findAll();
	}

}
