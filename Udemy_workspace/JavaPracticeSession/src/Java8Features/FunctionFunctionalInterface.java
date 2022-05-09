package Java8Features;

import java.util.function.Function;

public class FunctionFunctionalInterface {

	public static void main(String[] args) {
		
		Function<Integer, Integer> fn =i1->i1*i1;
		System.out.println(fn.apply(6));
		System.out.println(fn.apply(12));
		System.out.println(fn.apply(16));
		
		System.out.println("-----------------------------");
		
		Function<String, Integer> fn2=(s1)->s1.length();
		System.out.println(fn2.apply("This is my world"));
		System.out.println(fn2.apply("Masteroos"));
		System.out.println(fn2.apply(""));
		
		System.out.println("-------------------andThen || compose ------------------------------");
		
		Function<Integer, Integer> f1=(i1)->2*i1;
		Function<Integer, Integer> f2=(i1)->i1*i1*i1;
		
		
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
		
		
		

	}

}
