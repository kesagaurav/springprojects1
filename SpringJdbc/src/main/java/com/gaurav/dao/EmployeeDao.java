package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.Employee;

public interface EmployeeDao {

	Employee addEmployee(Employee employee);
	public void deleteEmployee(int empid);
	public int updateEmployee(Employee employee);
	public Employee getEmployeeById(int empid);
	public List<Employee> getAllEmployees();
	public List<Employee> getByNames(String empName);
	 
}
