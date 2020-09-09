package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SharePrice;

@Repository
public interface DTO extends JpaRepository<SharePrice, Integer> {
	
	List<SharePrice> findByCompanyName(String companyName);
	
}
