package com.gaurav;

public class Mother {

	private String motherName;

	public Mother() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mother(String motherName) {
		super();
		this.motherName = motherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	@Override
	public String toString() {
		return "Mother [motherName=" + motherName + "]";
	}

	
	
}
