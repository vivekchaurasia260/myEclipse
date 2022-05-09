package Collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetPrg {
	
	public static void main(String[] args) {
		
		
		// by doing this it will customised based on natural sorting order.
		TreeSet set = new TreeSet();

//		set.add("N");
//		set.add("B");
//		set.add("P");
//		set.add("?");
//		set.add("A");
//		set.add("a");
		
		set.add(10);
		set.add(0);
		set.add(15);
		set.add(20);
		set.add(20);
		set.add(5);
		
		System.out.println("Default Sorting " + set);
		
		
		// Customise sorting by using compare() method of Comaparator interface
		
		TreeSet set1 = new TreeSet(new MyComparator());
		
		set1.add(10);
		set1.add(0);
		set1.add(15);
		set1.add(20);
		set1.add(20);
		set1.add(5);
		
		
		System.out.println("Customised sorting " +set1);
		
		
	}
	
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		
		if(i1<i2)
			return 1;
		else if(i1>i2)
			return -1;
		else
			return 0;
		
	}
	
}
