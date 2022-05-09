package DefaultPackage;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pqueue=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		pqueue.add(25);
		pqueue.add(20);
		pqueue.add(35);
		pqueue.add(15);
		pqueue.add(18);
		pqueue.add(24);
		//pqueue.add(4);
		pqueue.add(17);
		
		
		System.out.println(pqueue);
		
		int x=pqueue.remove();
		System.out.println(x);
		
		int y=pqueue.remove();
		System.out.println(y);
		
		int z=pqueue.remove();
		System.out.println(z);
			

		
		

	}

}
