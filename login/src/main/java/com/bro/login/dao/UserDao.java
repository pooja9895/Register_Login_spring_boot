package com.bro.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bro.login.dto.User;
import com.bro.login.repository.UserRepository;


@Repository
public class UserDao {

		@Autowired
		UserRepository userRepository;
		
		public User saveUser(User user) {
			return userRepository.save(user);
		}
		
		public boolean validateUser(User user) {
			User u =  userRepository.validateUser(user.getUsername(), user.getPassword());
			if(u!=null)
			{
				return true; 
			}
			return false;
		}
}
