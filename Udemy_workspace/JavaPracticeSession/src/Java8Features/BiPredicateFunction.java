package Java8Features;

import java.util.function.BiPredicate;

// This interface is similate to normal predicate only diff is it has two argument...

public class BiPredicateFunction {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> b1=(i1, i2)->(i1+i2)%2==0;
		
		System.out.println(b1.test(15, 35));

	}

}
