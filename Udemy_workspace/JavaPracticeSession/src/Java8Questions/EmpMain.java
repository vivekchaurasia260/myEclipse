package Java8Questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		List<Employee> arr = new ArrayList<>();
		
		arr.add(new Employee(101, "Arnold Kivv", "arnold.kvv@gmail.com", 700000.00));
		arr.add(new Employee(102, "Kriti Gupta", "guptakriti441@gmail.com", 450000.00));
		arr.add(new Employee(103, "Rahul Shukla", "rahulshukla770@gmail.com", 870000.00));
		arr.add(new Employee(104, "Swati Malik", "malikaswati331@gmail.com", 330000.00));
		arr.add(new Employee(105, "Sunder Bajaj", "bajaj.sunder999@gmail.com", 910000.00));
		arr.add(new Employee(106, "Palak Srivastav", "sriPalak441@gmail.com", 250000.00));
		arr.add(new Employee(106, "Annie Tiwari", "tiwariann616@gmail.com", 450000.00));
		arr.add(new Employee(106, "Arun Sharma", "arunsharma991@gmail.com", 910000.00));
		
		
		arr.stream().forEach(e -> System.out.println(e));
		
//		// finding the 3rd largest salary by using stream api..		
//		Optional<Double> salary = arr.stream().map(e->e.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst();
//		
//		System.out.println(salary.get());
//				
//		
//		//highest salary
//		double sal = arr.stream().map(e->e.getSalary()).max(Double :: compare).get();
//		
//		System.out.println("Highest Salary " + sal);
//		
//		// employee name which is having highest salary.
//		arr.stream().filter(e->e.getSalary()==sal).forEach(e->System.out.println(e.getName()));
		
		
		// to print emp based on salary..
		
		System.out.println("\nEmp based on Salary\n");
		
		Map<Double, List<Employee>> empListBasedOnSalary = arr.stream().collect(Collectors.groupingBy(Employee :: getSalary, Collectors.toList()));
		
		
		empListBasedOnSalary.entrySet().forEach(entry -> {
			
			System.out.println(entry.getKey()+"-----"+entry.getValue());
			
		});
		
		
		//counting the employee based on salary...
		
		Map<Integer, Long> countByGroup = arr.stream().collect(Collectors.groupingBy(Employee :: getId, Collectors.counting()));
		
		
		countByGroup.entrySet().forEach(entry -> {
			
			System.out.println(entry.getKey()+"---"+entry.getValue());			
		});
		
		
		// ignore specific id ...
		
		long count = arr.stream().filter(e -> e.getId()!=106).count();
		
		System.out.println(count);
		
		
		// finding the maximum / minimum salary of employee
		
		Optional<Double> maxSalary = arr.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).findFirst();
		
		Optional<Double> minSalary = arr.stream().map(e -> e.getSalary()).sorted().findFirst();
		
		
		arr.stream().max(Comparator.comparing(Employee :: getSalary));
		
		
		System.out.println("The Salaries are: " +maxSalary.get() +"---" + minSalary.get());
		
		
		// max salary with each id
		
		//arr.stream().collect(Collectors.groupingBy(, null))
		
		
		
		

	}

}
