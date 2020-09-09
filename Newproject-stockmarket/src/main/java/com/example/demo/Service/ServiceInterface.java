package com.example.demo.Service;

import com.example.demo.model.Company;

public interface ServiceInterface {
	
	public Iterable<Company> GetAll();
	public Company Filldata(Company company);
	public Company GetByCompanyName(String str);
	
}
