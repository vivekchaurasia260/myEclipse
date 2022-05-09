package Collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparableVsComparator {
	
	public static void main(String[] args) {
			
		Set hash = new TreeSet(new MyComparator1());
		
//		hash.add(10);
//		hash.add(5);
//		hash.add(20);
//		hash.add(30);
//		hash.add(15);
//		hash.add(25);
		
		
		hash.add("Raja");
		hash.add("SobhaRani");
		hash.add("Rajkumari");
		hash.add("GangaBhavani");
		hash.add("Ramulamma");
		
		
		System.out.println(hash);
		
	}

}

class MyComparator1 implements Comparator {
	
	
	public int compare(Object obj1, Object obj2) {
		
//		Integer i1 = (Integer)obj1;
//		Integer i2 = (Integer)obj2;
		
		String str1 = (String) obj1;
		String str2 = obj2.toString();
	
		return str1.compareTo(str2);
		
	}
}
