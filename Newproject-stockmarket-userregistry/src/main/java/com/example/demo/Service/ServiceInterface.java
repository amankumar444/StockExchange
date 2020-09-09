package com.example.demo.Service;

import com.example.demo.model.User;

public interface ServiceInterface {

	public User registerUser(User user) ;
	//public Optional<User> getuserByEmail(String email);
	public User login(User user) ;
}
