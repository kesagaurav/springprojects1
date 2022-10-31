package com.gaurav.SpringBasics;

public class Student {
private int studentId;
private String StudentName;
private String studentAddress;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int studentId, String studentName, String studentAddress) {
	super();
	this.studentId = studentId;
	StudentName = studentName;
	this.studentAddress = studentAddress;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	System.out.println("setting id");
	this.studentId = studentId;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	System.out.println("setting name");
	StudentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	System.out.println("setting address");
	this.studentAddress = studentAddress;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", studentAddress=" + studentAddress
			+ "]";
}


}
