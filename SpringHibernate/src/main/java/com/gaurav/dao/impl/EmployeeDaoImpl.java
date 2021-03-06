package com.gaurav.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gaurav.dao.EmployeeDao;
import com.gaurav.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private SessionFactory sessionFactory;
	private Session session;
	
	public void setSessionFactory( SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	public Session getSession() {
		return session=sessionFactory.openSession();
		
	}
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		Session ses=getSession();
		Transaction t=ses.beginTransaction();
		ses.save(employee);
		t.commit();
		ses.close();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Session ses=getSession();
		Transaction t=ses.beginTransaction();
		ses.update(employee);
		t.commit();
		ses.close();
		return employee;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session ses=getSession();
		Transaction t=ses.beginTransaction();
		Employee emp=(Employee) ses.get(Employee.class, id);
		t.commit();
		ses.close();
		return emp;
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Session ses=getSession();
		Transaction t=ses.beginTransaction();
		Employee emp=new Employee();
		emp.setEmp_id(id);
		ses.delete(emp);
		t.commit();
		ses.close();
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return getSession().createQuery("from com.gaurav.model.Employee").list();
	}

	@Override
	public List<Employee> getAllEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return getSession().createQuery("from com.gaurav.model.Employee where name= :name").setString("name",name).list();
	}

	@Override
	public List<Employee> getAllEmployeesByDesignation(String designation) {
		// TODO Auto-generated method stub
		return getSession().createQuery("from com.gaurav.model.Employee where designation= :designation").setString("designation",designation).list();
	}

	@Override
	public List<Employee> getAllEmployeesByAge(int age) {
		// TODO Auto-generated method stub
		return getSession().createQuery("from com.gaurav.model.Employee where age= :age").setInteger("age",age).list();
	}

	@Override
	public List<Employee> getAllEmployeesBySalary(double salarly) {
		// TODO Auto-generated method stub
		return getSession().createQuery("from com.gaurav.model.Employee where salarly= :salarly").setDouble("salarly",salarly).list();
	}

}
