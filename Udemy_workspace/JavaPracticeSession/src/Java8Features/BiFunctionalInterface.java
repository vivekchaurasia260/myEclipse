package Java8Features;

import java.util.function.BiFunction;

// It is same as Function Interface only diff is it has two args...

public class BiFunctionalInterface {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, String> bf1 = (i1, i2)->(i1+i2)%2==0 ? "It is even number":"It is odd number";
		
		System.out.println(bf1.apply(25, 15));
		System.out.println(bf1.apply(23, 12));		

	}

}
