package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Company;
import com.example.demo.repo.Companyrepo;
import com.example.demo.repo.IPOrepo;
import com.example.demo.repo.StockExchangerepo;

@SuppressWarnings("unused")
@Service
public class ServiceImpl implements  ServiceInterface{
	
	@Autowired
	private Companyrepo comprepo;
	private StockExchangerepo srepo;
	private IPOrepo iporepo;
		

	@Override
	public Iterable<Company> GetAll() {
		return (comprepo.findAll());
	}


	@Override
	public Company Filldata(Company company) {
		Company c_company = new Company();
		comprepo.save(company);
		return company;
	}

	@Override
	public Company GetByCompanyName(String str) {
		Company findbyCompanies = comprepo.findByCompanyName(str);
		return findbyCompanies;
	}

}
