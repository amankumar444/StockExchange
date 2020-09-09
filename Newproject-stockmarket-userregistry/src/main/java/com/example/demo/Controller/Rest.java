package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ServicesImpl;
import com.example.demo.model.User;

@RestController
@RequestMapping("/")
public class Rest {
	
	@Autowired
	private ServicesImpl sr;
	
	
	/* 
	 * @CrossOrigin(origins = "http://localhost:4200")
	 * 
	 */
	@PostMapping("registeruser")
	public User registerUser(@RequestBody User user) {
		try {
			System.out.print(user);
			return new User (sr.registerUser(user));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/* 
	 * @CrossOrigin(origins = "http://localhost:4200")
	 * 
	*/
	@PostMapping("login")
	public ResponseEntity<User> login(@RequestBody User user) {
		try {
			return new ResponseEntity<User>(sr.login(user), HttpStatus.FOUND);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
}
