package com.example.demo.Service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.Repo;

@Service
@Transactional
public class ServicesImpl implements ServiceInterface{

	@Autowired
	private Repo repo;
	
	@Override
	public User registerUser(User user)  {
		System.out.print(user);

		if((User usertest = repo.findByEmailId(user.getEmailId())) != null) {
			repo.save(userCheck);
			return userCheck;
		}
		else
			throw new Exception("User with " + userCheck.getEmailId() + " is already present" );		
	}

	@Override
	public User login(User user)  {
		User userCheck = repo.findByEmailIdAndPassword(user.getEmailId(), user.getPassword());
		//User user1 = userCheck.get();
		if(userCheck != null) {
			return userCheck;
		}
		else
			throw new Exception("Bad Credentials");
		
	}

}

