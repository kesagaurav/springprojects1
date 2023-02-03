package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {
	public Employee AddEmployee(Employee e);

	public Employee getById(int id);

	public List<Employee> getAllEmployees();
}
