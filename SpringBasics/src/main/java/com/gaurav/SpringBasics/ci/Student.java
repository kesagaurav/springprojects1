package com.gaurav.SpringBasics.ci;

public class Student {
	private String name;
	private String studentId;
	private Certi certi;
	public Student(String name, String studentId,Certi certi) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return this.name + " " + this.studentId+"{"+this.certi.name +"}";
	}
	
	
}
