package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Company;
import com.example.demo.model.Employee;
import com.example.demo.repository.CompanyRepository;
import com.example.demo.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository comprepository;

	@Override
	public Company AddCompany(Company c) {
		// TODO Auto-generated method stub
		return comprepository.save(c);
	}

	@Override
	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		return comprepository.findAll();
	}

	@Override
	public void getById(int id) {
		// TODO Auto-generated method stub
		comprepository.findById(id);

	}

}
