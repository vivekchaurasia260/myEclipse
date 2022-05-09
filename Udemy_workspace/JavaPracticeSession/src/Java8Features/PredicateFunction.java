package Java8Features;

import java.util.function.Predicate;



public class PredicateFunction {

	public static void main(String[] args) {
		
		Predicate<String> p = (str)->str.length()>=5;
		System.out.println(p.test("Hhjef"));
		System.out.println(p.test("dsd"));
		System.out.println(p.test("adfdwfwf"));
		
		
		String[] arr = {"adfadf", "wferer", "nxx", "ssffd", "asdaffd"};
		
		Predicate<String> p2 = (str)->str.length()>5;
		
		for(String s1 : arr) {
			
			if(p2.test(s1)) {
				System.out.println(s1);
			}
			
		}
		
		int[] arr2 = {10,5,15,20,25,30};
		
		Predicate<Integer> p3=(i1)->i1%2==0;
		Predicate<Integer> p4=(i1)->i1>10;
		
		
		System.out.println("The number which are even and greater than 10");
		
		for(int x:arr2) {
			
			if(p3.and(p4).test(x)) {
				System.out.println(x);
			}
			
		}
		
		System.out.println("The number which are even or greater than 10");
		
		for(int x:arr2) {
			
			if(p3.or(p4).test(x)) {
				System.out.println(x);
			}
			
		}
		
		System.out.println("The number which are not even");
		
		for(int x:arr2) {
			
			if(p3.negate().test(x)) {
				System.out.println(x);
			}
			
		}
		
		
	}
}
