import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("Enter your First Name");
//		String firstName=scan.nextLine();
//	
//		System.out.println("Enter your Year of Birth");
//		int year=scan.nextInt();
//		
//		int age = 2020-year;
//		
//		if(age>0 && age<101) {
//			System.out.println("Hi "+firstName+" your age is "+age);
//		}
//		else
//			System.out.println("Invalid age");	
		
		int count=0, sum=0;	
	
		for(int i=1; i<11; i++) {
			
			System.out.println("Enter Number #"+i+":");
			
			if(scan.hasNextInt()) {
				int input=scan.nextInt();
				count++;
				sum+=input;
			}
			else
				System.out.println("Invalid Number");
			
			scan.nextLine();
		}
		
		System.out.println("sum = " +sum);
		
	}
}
