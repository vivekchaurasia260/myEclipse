package Overloading;

public class MultiplyNum {

	static int Multiply(int a, int b)
    {
		System.out.println("Method-1");
        return a * b;
    }
  
    // Method with the same name but 2 double parameter
    static double Multiply(double a, double b)
    {
    	System.out.println("Method-2");
        return a * b;
    }

	public static void main(String[] args) {
		
		System.out.println(MultiplyNum.Multiply(2, 4));
		  
        System.out.println(MultiplyNum.Multiply(5, 6.3));
	}

}
