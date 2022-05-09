package _30_Day_challenge;

import java.util.Scanner;

public class Day_2_Operators {
	
	public static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip;
		double tax;
		
		tip=((double)meal_cost/100)*tip_percent;
		tax=((double)meal_cost/100)*tax_percent;
		
		double total_cost=Math.round(meal_cost+tax+tip);
		
		System.out.println((int)total_cost);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double meal_cost=scan.nextDouble();
		
		int tip_percent=scan.nextInt();
		int tax_percent=scan.nextInt();
		
		solve(meal_cost, tip_percent, tax_percent);
		
	}

}
