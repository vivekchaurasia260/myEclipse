package Java8Features;

import java.util.function.Supplier;

// Supplier interface is used for retrieving data. It has one method get();

public class SupplierFunction {

	public static void main(String[] args) {
		
		Supplier s1 =()->"This is supplier functional interface";
		
		
		System.out.println(s1.get());

	}

}
