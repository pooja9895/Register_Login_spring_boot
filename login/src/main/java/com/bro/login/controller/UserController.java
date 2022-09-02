package com.bro.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bro.login.dao.UserDao;
import com.bro.login.dto.User;


@RestController
public class UserController {
		
	@Autowired
	UserDao userDao;
	
	@PostMapping("/myuser")
	public User saveUser(@RequestBody User user) {
		return userDao.saveUser(user);
	}
	
	@GetMapping("/mylogin")
	public String validateUser(@RequestBody User user) {
		boolean res =  userDao.validateUser(user);
		if(res==true)
		{
			return "Login successfull..";
		}
		return "Invalid username or password..";
	}
}
