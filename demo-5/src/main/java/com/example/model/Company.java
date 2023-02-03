package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Company {
	@Id
	@GeneratedValue
	private int cid;
	private String companyName;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int cid, String companyName) {
		super();
		this.cid = cid;
		this.companyName = companyName;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", companyName=" + companyName + "]";
	}
	
	
}
