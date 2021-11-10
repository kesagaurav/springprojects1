package com.gaurav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
	private String name;
	private int age;
	private double salarly;
	private String designation;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, double salarly, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.salarly = salarly;
		this.designation = designation;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalarly() {
		return salarly;
	}
	public void setSalarly(double salarly) {
		this.salarly = salarly;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", age=" + age + ", salarly=" + salarly
				+ ", designation=" + designation + "]";
	}
	
	
	
	
	
}
