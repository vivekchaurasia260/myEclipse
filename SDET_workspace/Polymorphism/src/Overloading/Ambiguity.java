package Overloading;

public class Ambiguity {
	
	 void sum(int a,long b) {
		System.out.println("a method invoked");
	 }  
	  void sum(long a,int b) {
		  System.out.println("b method invoked");
	  }  

	public static void main(String[] args) {
		Ambiguity obj=new Ambiguity();  
	//	obj.sum(20,20);//now ambiguity  
	}

}
