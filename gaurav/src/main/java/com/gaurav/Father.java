package com.gaurav;

public class Father {

	private String fatherName;

	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Father(String fatherName) {
		super();
		this.fatherName = fatherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Override
	public String toString() {
		return "Father [fatherName=" + fatherName + "]";
	}
	
	
	
}
