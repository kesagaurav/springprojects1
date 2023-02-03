package com.example.gaurav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Employee {
	@Id
	@GeneratedValue
	private int eid;
	private String name;
	private String desc;
	
	
	
	
}
