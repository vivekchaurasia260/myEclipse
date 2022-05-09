package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollection {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(60);
		list.add(35);
		list.add(25);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(9);
		
		
		System.out.println(list);
		
		List<Integer> res = list.stream().filter((i1)->i1%2==0).collect(Collectors.toList());
				
		System.out.println(res);
		
		List<Integer> res1 = list.stream().map((i1)->i1*2).collect(Collectors.toList());
		
		System.out.println(res1);
		
		
		Integer[] i=list.stream().toArray(Integer[]::new);
		Stream.of(i).forEach(System.out::println);
		
		
		
		
		
		
		
		

	}

}
