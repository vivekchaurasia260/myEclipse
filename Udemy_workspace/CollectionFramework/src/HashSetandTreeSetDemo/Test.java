package HashSetandTreeSetDemo;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<>();
		
		TreeSet<String> set = new TreeSet<>();
		
		
		hash.add("Hello");
		hash.add("Me");
		hash.add(null);
		hash.add("Youe");
		hash.add("Welcome");
		hash.add(null);
		
		System.out.println(hash);
		
		
		
		set.add(null);
//		set.add("Khan");
//		set.add("Vinod");
//		set.add(null);
//		set.add("Pankaj");
//		set.add("Astron");
		
		System.out.println(set);
		

	}

}
