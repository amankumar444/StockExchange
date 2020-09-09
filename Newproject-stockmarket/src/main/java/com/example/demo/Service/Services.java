package com.example.demo.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SharePrice;
import com.example.demo.repo.DTO;

@Service
@Transactional
public class Services {
	
	@Autowired
	private DTO repoDto;


	public void SaveCustomerData() throws FileNotFoundException {
		BufferedReader Br = new BufferedReader(new FileReader("src\\main\\resources\\sample_stock_data.csv"));
		
		String line;
		Integer i = 0;
		try {
			while((line = Br.readLine()) != null) {
				String [] data = line.split(",");
				SharePrice sharePrice = new SharePrice();
				sharePrice.setCompanyId(i);
				sharePrice.setCompanyName(data[0]);
				sharePrice.setExchangeName(data[1]);
				sharePrice.setStockPrice(data[2]);
				sharePrice.setDate(data[3]);
				sharePrice.setTime(data[4]);
				
				System.out.println(sharePrice);
				repoDto.save(sharePrice);
				i = i+1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<SharePrice> getList() {
		return repoDto.findAll();
	}
	
	public List<SharePrice> findbyName(String companyName){
		return repoDto.findByCompanyName(companyName);
	}
}