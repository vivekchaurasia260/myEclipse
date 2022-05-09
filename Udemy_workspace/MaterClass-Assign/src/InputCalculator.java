import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}
	public static void inputThenPrintSumAndAverage() {
		int sum=0, count=0, avg=0;
		Scanner scan=new Scanner(System.in);
	
		while(true) {
			boolean input = scan.hasNextInt();
			if(input) {
				int num=scan.nextInt();
				sum+=num;
				count++;
			}
			else
				break;			
		}
		if(count>0)
			avg=sum/count;
		
		System.out.println("SUM = "+sum+" AVG = "+avg);
	}
}
