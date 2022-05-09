import java.util.Scanner;

public class MinAndMaxInputChallenge {
	public static void main(String[] args) {
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
	
		while(true) {
			boolean input = scan.hasNextInt();
			if(input) {
				int num=scan.nextInt();
				if(num>max)
					max=num;
				if(num<min)
					min=num;
			}
			else
				break;			
		}
		
		System.out.println("Min: "+min+" Max: "+max);
	}
}
