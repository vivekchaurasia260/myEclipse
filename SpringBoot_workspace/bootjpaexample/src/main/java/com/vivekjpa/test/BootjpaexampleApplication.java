package com.vivekjpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vivekjpa.test.dao.UserRepository;
import com.vivekjpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user1 = new User();
//		user1.setName("Neeraj Pandey");
//		user1.setCity("Varanasi");
//		user1.setStatus("I am a Consultant of Integrated services in AI");
//		
//		User user2 = new User();
//		
//		user2.setName("Rajan Damodar");
//		user2.setCity("Delhi States");
//		user2.setStatus("I am a Data Analyst");
//				
//		User user3 = new User();
//		
//		user3.setName("Rohit Raj");
//		user3.setCity("Gurugram");
//		user3.setStatus("I am a senior advisor");
//		
//		List<User> users = List.of(user1, user2, user3);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user-> {
//			System.out.println(user);
//		});
		
	
	// TO UPDATE THE RECORD IN THE TABLE	
		
//		Optional<User> updateUser = userRepository.findById(8);
//		
//		User user = updateUser.get();
//		
//		user.setName("Rohit Raina");
//		
//		User result = userRepository.save(user);
//		
//		System.out.println(result);
//		
//		
//		System.out.println(" Update done successfully!!");
		
	// TO RETRIEVE THE RECORD BY ID (we retrieve by all ids or by specific id)
		
//		Iterable<User> retrieveUser = userRepository.findAll();
//		
//		Iterator<User> itr = retrieveUser.iterator();
//		
//		// Here we use either lambda loop or by using hasNext() method
//		
//		itr.forEachRemaining(user-> {System.out.println(user);});  // This is lamba forEach.
		
	
	// DELETE THE RECORD FROM THE TABLE BY ID
		
//		userRepository.deleteById(7);
//		System.out.println("User row is deleted");
		
		
		
	// RETRIEVING DATA BY USING CUSTOM METHOD
		
//		List<User> users = userRepository.findByName("Neeraj Pandey");
//		
//		users.forEach(user-> {System.out.println(user);});
		
		
		
	// JPQL QUERY to get all the users
		
		List<User> list = userRepository.getAllUsers();
		
		list.forEach(u -> {System.out.println(u);});
		
		
		System.out.println("_______________________________________________________");
		
		List<User> user = userRepository.getUserbyName("Neeraj Pandey", "Varanasi");
		
		user.forEach(u->{System.out.println(u);});
		
		
		System.out.println("________________________________________________________");
		
		userRepository.getUserByNativeQuery().forEach(u->{System.out.println(u);});
		
		
	}

}
