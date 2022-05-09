package testDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("A", "A@a.com"));
		list.add(new Employee("B", "A@a.com"));
		list.add(new Employee("C", "C@a.com"));
		
		
		Set<Employee> set = new HashSet<>();
		
//		Iterator<E> itr = list.iterator();
//		
//		itr(itr.hasNext()) {
//			
//			if(set.add())
//			
//		}
//		
	//	list.filter(emp).forEach(emp -> set.add(emp));

		System.out.println(set);
		
	//	list.stream().filter()

	}

}
