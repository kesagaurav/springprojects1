package com.gaurav.model;

public class Employee {

	private int empid;
	private String empName;
	private String salarly;
	private String designation;
	public Employee() {
		super();
	}
	public Employee(int empid, String empName, String salarly, String designation) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salarly = salarly;
		this.designation = designation;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSalarly() {
		return salarly;
	}
	public void setSalarly(String salarly) {
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
		return "Employee [empid=" + empid + ", empName=" + empName + ", salarly=" + salarly + ", designation="
				+ designation + "]";
	}
	
	
	
	
	
	
}
