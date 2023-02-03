package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Company;

public interface CompanyService {
	Company AddCompany(Company c);

	List<Company> getAllCompany();

	void getById(int id);
}
