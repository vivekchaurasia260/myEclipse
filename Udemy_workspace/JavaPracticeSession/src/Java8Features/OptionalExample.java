package Java8Features;

import java.util.Optional;

public class OptionalExample {
	
	public static Optional<String> getName() {
		
		String name="vivek";
		
		
		return Optional.ofNullable(name);		
	}
	
	public static void main(String[] args) {
		
		Optional<String> res = OptionalExample.getName();
		
		System.out.println(res.isPresent());
		System.out.println(res.get());
		System.out.println(res.isEmpty());
		
		
	}

}
