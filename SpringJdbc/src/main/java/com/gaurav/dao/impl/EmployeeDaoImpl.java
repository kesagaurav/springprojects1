package com.gaurav.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.gaurav.dao.EmployeeDao;

import com.gaurav.model.Employee;

@Component("EmployeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate template;
	private DataSource dataSource;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template = new JdbcTemplate(dataSource);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		String query = "insert into employee(empid,empName,salarly,designation) values(?,?,?,?)";
		template.update(query, employee.getEmpid(), employee.getEmpName(), employee.getSalarly(),
				employee.getDesignation());

		return employee;
	}

	@Override
	public void deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		String query = "delete from employee where empid=?";
		template.update(query, empid);
		System.out.println("delete the employee " + empid);

	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String query = "update  employee set salarly=?,designation=? where empid=?";
		int update = template.update(query, employee.getSalarly(), employee.getDesignation(), employee.getEmpid());
		System.out.println("update the employee " + update);
		return update;
	}

	@Override
	public Employee getEmployeeById(int empid) {
		// TODO Auto-generated method stub
		String query="select empid,empName,salarly,designation from employee where empid=? ";
		Employee employee=template.queryForObject(query, new Object[] {empid},new EmployeeRowMapper());
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {

		String query="select empid,empName,salarly,designation from employee";
		List<Employee> empList=template.query(query,new EmployeeRowMapper());
		return empList;
	}

	@Override
	public List<Employee> getByNames(String empName) {
		String query="select empid,empName,salarly,designation from employee where empName=?";
		List<Employee> emp=template.query(query,new EmployeeRowMapper(),new Object[] {empName});
		return emp;
	}

}
