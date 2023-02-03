package com.example.demo.service;

import java.util.*;

import com.example.demo.model.Employee;

public interface EmployeeService {

	Employee AddEmployee(Employee e);

	List<Employee> getAllEmployees();

	void getById(int id);
}
