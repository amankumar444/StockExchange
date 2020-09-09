package com.example.demo.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ServiceImpl;
import com.example.demo.Service.Services;
import com.example.demo.model.Company;
import com.example.demo.model.SharePrice;

@RestController
@RequestMapping("/Companies")
public class Rest {
	
	@Autowired
	private ServiceImpl sr;
	
	@Autowired
	private Services si;
	
	@GetMapping("/GetAll")
	public ResponseEntity<Iterable<Company>> GetAll(){
		return new ResponseEntity<Iterable<Company>>(sr.GetAll(), HttpStatus.OK);
	}
	@PostMapping("/upload")
	public ResponseEntity<Company> Filldata(@RequestBody Company c){
		System.out.println(c);
		return new ResponseEntity<Company>(sr.Filldata(c), HttpStatus.CREATED);
	}

	@GetMapping("/FindByName/{cName}")
	public ResponseEntity<Company> GetByCompanyName(@PathVariable("cName") String cName){
		return new ResponseEntity<Company>(sr.GetByCompanyName(cName),HttpStatus.FOUND);
	}
	
	
	@GetMapping("/saveData")
	public void SetCustomerData() throws IOException {
		si.SaveCustomerData();
	}

	@GetMapping("/GetAllSharePrice")
	public ResponseEntity<Iterable<SharePrice>> getList(){
		return new ResponseEntity<Iterable<SharePrice>>(si.getList(), HttpStatus.OK);
	}
	@GetMapping("/{companyName}")
	public ResponseEntity<Iterable<SharePrice>> findbyName(@PathVariable("companyName") String companyName){
		return new ResponseEntity<Iterable<SharePrice>>(si.findbyName(companyName), HttpStatus.FOUND);
	}
	
}





