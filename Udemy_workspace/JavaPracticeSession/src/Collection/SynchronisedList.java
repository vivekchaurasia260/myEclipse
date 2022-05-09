package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class SynchronisedList {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		List l = Collections.synchronizedList(al);
		
		l.add(10);
		l.add(20);
		l.add(60);
		l.add(80);
		l.add(40);
		l.add(90);
		
		ListIterator litr = l.listIterator();
		
		while(litr.hasNext())
				
		
		System.out.println(l);
		
		
	}

}
