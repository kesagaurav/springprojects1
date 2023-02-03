package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table

public class Employee {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String desc;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fk")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Company company;
	@OneToMany(mappedBy = "employee",cascade= CascadeType.ALL)
	private List<Address> addressList = new ArrayList<>();

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String desc, Company company, List<Address> addressList) {
		super();
		this.name = name;
		this.desc = desc;
		this.company = company;
		this.addressList = addressList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Company getCompany() {
		return company;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desc=" + desc + ", company=" + company + ", addressList="
				+ addressList + "]";
	}

}
