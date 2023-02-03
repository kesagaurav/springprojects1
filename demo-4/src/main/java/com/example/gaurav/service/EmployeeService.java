package com.example.gaurav.service;

import java.util.List;

import com.example.gaurav.model.Employee;
import com.example.gaurav.model.EmployeeDetails;

public interface EmployeeService {
	public Employee AddEmployee(Employee e);

	public void getById(int id);

	public List<Employee> getAllEmployees();

}
