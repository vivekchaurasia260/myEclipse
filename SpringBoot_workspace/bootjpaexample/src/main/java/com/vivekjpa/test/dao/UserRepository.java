package com.vivekjpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.vivekjpa.test.entities.User;

// We can extends CRUD repo or JPA repo to get more functionality on our object i.e, User

// In the CRUD REPO first generic type is which type of data you want to handle(kis type ka data handle krna hai)

// and second generic type is ID of the data which I want to handle (in this case Integer is the ID of User data)

// If it uses Long data then we use long in the ID.

public interface UserRepository extends CrudRepository<User, Integer> {
	
	//Note: This is custom method where find means introducer and ByName means criteria 
	public List<User> findByName(String name);
	
	// we can query annotation to manually give query
	
	@Query("select u from User u")
	public List<User> getAllUsers();
	
	// Here we give parameter in the query (IMP: don't put space between in the where clause condition)
	
	@Query("select u from User u where u.name =:n and u.city=:c")
	public List<User> getUserbyName(@Param("n") String name, @Param("c") String city);
	
	
	// We can also use native query
	
	@Query(value="select * from User", nativeQuery=true)
	public List<User> getUserByNativeQuery();
	
	
}
