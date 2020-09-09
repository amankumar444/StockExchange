package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface Repo extends JpaRepository<User, Integer> {

	public User findByEmailId(String emailId);

    public User findByEmailIdAndPassword(String email, String password);
}
