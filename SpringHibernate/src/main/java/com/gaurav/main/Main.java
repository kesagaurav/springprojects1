package com.gaurav.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaurav.dao.EmployeeDao;
import com.gaurav.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_hibernate_beans.xml");
		EmployeeDao emp = (EmployeeDao) context.getBean("employeeDAO");

		emp.addEmployee(new Employee("gaurav", 23, 40000.00, "digitalspecialist"));
		emp.addEmployee(new Employee("gaurav", 24, 34000.00, "powerprogrammer"));
		emp.addEmployee(new Employee("gaurav", 23, 940000.00, "pathology"));
		emp.addEmployee(new Employee("rama", 26, 450000.00, "se"));
		emp.addEmployee(new Employee("krishna", 27, 940000.00, "se"));
		emp.addEmployee(new Employee("joe", 23, 940000.00, "se"));

		System.out.println(emp.getAllEmployees());

		System.out.println("all employee names statring with name  gaurav");
		List<Employee> allEmployeesByName = emp.getAllEmployeesByName("gaurav");
		System.out.println(allEmployeesByName);

		System.out.println("all employess with ages");
		List<Employee> allEmployeesByAge = emp.getAllEmployeesByAge(23);
		System.out.println(allEmployeesByAge);

		System.out.println("all employess with designation");
		List<Employee> allEmployeesByDesignation = emp.getAllEmployeesByDesignation("se");
		System.out.println(allEmployeesByDesignation);

		System.out.println("all employees with salarly");
		List<Employee> allEmployeesBySalary = emp.getAllEmployeesBySalary(940000.00);
		System.out.println(allEmployeesBySalary);

	}

}
