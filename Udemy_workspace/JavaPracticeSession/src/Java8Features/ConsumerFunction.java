package Java8Features;

// This is usually used for printing purpose.

import java.util.function.Consumer;

public class ConsumerFunction {

	public static void main(String[] args) {
		
		Consumer<Integer> c1=(i1)->System.out.println("The number is " +i1);
		Consumer<Integer> c2=(i2)->System.out.println("The number is odd..");
		
		c1.accept(15);
		
		
		c1.andThen(c2).accept(35);		
			

	}

}
