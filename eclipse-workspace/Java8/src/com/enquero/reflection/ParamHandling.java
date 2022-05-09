package com.enquero.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParamHandling {

	
	
	 public static List<String> getParameterNames(Method method) {
	        Parameter[] parameters = method.getParameters();
	        List<String> parameterNames =   Arrays.asList(parameters).stream().filter(e -> e.isNamePresent()).map(p -> p.getName()).collect(Collectors.toList());
	        return parameterNames;
	    }
	
	
	public static void main(String args[] ) {
		
		Method[] methods  = Employee.class.getDeclaredMethods();
		
		Arrays.asList(methods).stream().map(e  -> getParameterNames(e) ).forEach( System.out::println);
		
		
		
	}
	
}
