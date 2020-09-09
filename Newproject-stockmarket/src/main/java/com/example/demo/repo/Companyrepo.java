package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Company;

@Repository
public interface Companyrepo extends JpaRepository<Company, Integer> {
	
	Company findByCompanyName(String str);
}
