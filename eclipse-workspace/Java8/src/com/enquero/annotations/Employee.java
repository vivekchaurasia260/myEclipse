package com.enquero.annotations;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Day("Monday")
@Day("Tuesday")
public class Employee {

@Email	
private	String email;
	
List<@NotNull String> personList = new ArrayList<>();


public String dayOftheWeek;


public void readEmail() {
	
	Object obj1 = new Object();
	Employee emp = (@NotNull Employee) obj1;
	
	
	
	
	/*
	 * it can be used with generic, type casting , constructor , inheritance , exceptions , method references , nested types 
	 * 
	 * 
	 */
	
}


public static void main(String args[]) {
	
	   Day[] day = Employee.class.getAnnotationsByType(Day.class);  
	   
       Arrays.asList(day).stream().map(e -> e.value()).forEach(System.out::println); 
	
       
}


}
