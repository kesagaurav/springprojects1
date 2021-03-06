package com.gaurav;

import org.springframework.beans.factory.annotation.Autowired;

public class Gaurav {

	private int id;
	private String name;
	private String color;
	private Mother mother;
	private Father father;
	private Address address;

	public Gaurav() {
		super();
	}

	@Autowired
	public Gaurav(int id, String name, String color, Mother mother, Father father, Address address) {
		super();
		
		this.id = id;
		this.name = name;
		this.color = color;
		this.mother = mother;
		this.father = father;
		this.address = address;
		System.out.println("inside constructror" + this.address);

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Mother getMother() {
		return mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}

	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Gaurav [id=" + id + ", name=" + name + ", color=" + color + ", mother=" + mother + ", father=" + father
				+ ", address=" + address + "]";
	}

}
