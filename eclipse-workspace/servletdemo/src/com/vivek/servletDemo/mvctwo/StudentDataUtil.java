package com.vivek.servletDemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents() {
		
		// create an empty list
		List<Student> students = new ArrayList<Student>();
		
		// add sample data
		students.add(new Student("Ajay", "Singh", "ajsngh770@gmail.com"));
		students.add(new Student("Sonia", "Yadav", "yadavsoni88@gmail.com"));
		students.add(new Student("Karan", "Gupta", "karangupta995@gmail.com"));
		students.add(new Student("Shweta", "Maurya", "maurya.shweta112@gmail.com"));
		students.add(new Student("Neeraj", "Patel", "patelneeraj450@gmail.com"));
		
		// return the list
		
		return students;
		
		
	}

}
