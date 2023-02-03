package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private int aid;
	private String street;
	private String country;
	private String state;

	@ManyToOne
	@JoinColumn(name = "eid")
	private Employee employee;

}
