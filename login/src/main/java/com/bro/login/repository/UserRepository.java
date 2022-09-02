package com.bro.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bro.login.dto.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.username=?1 AND u.password=?2")
	 public User validateUser(String username,String password);
	
//	@Query("select u from User u where u.username=:myname AND u.password=:mypassword")
//	public User validateUser(String myname,String mypassword);
	
//	@Query("select u from User u where u.username=:myname AND u.password=:mypassword")
//	public User validateUser(@Param("myname") String username,@Param("mypassword") String password);
}
