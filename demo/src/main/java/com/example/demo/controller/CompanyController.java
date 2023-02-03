package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;
@RestController
public class CompanyController  {
	@Autowired
	private CompanyService service;
	

	@PostMapping("/company")
	public Company AddCompany(@RequestBody Company c) {
		// TODO Auto-generated method stub
		return service.AddCompany(c);
	}


	@GetMapping("/companies")
	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		return service.getAllCompany();
	}


	@GetMapping("/company/{id}")
	public void getById(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.getById(id);
		
	}

}
