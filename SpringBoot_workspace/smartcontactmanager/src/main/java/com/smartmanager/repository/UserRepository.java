package com.smartmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smartmanager.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	
	@Query("Select u from Users u where u.email = :email")
	public Users getUserByUserName(@Param("email") String email);
	

}
