package com.gaurav.model;

import java.util.List;
import java.util.Map;

public class Student {

	private int id;
	private String name;
	private Address address;
	private List<Team> team;
	private Map<String, String> courses;

	public Student() {
		super();
	}

	public Student(int id, String name, Address address, List<Team> team, Map<String, String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.team = team;
		this.courses = courses;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Team> getTeam() {
		return team;
	}

	public void setTeam(List<Team> team) {
		this.team = team;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", team=" + team + ", courses="
				+ courses + "]";
	}

}
