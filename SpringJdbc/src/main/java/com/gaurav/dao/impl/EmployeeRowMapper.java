package com.gaurav.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gaurav.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpid(rs.getInt("empid"));
		employee.setEmpName(rs.getString("empName"));
		employee.setDesignation(rs.getString("designation"));
		employee.setSalarly(rs.getString("salarly"));

		return employee;
	}

}
