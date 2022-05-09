package DefaultPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineStockSpan {

	public static void main(String[] args) {
		
		int[] prices= {100, 80, 60, 70, 60, 75, 85};

	}
	
	public static int onlineStock(int[] price) {
		int count=0;
		List<Integer> list=new ArrayList<>();
		
		for(int index=0; index<price.length; index++) {
			
		int value=price[index];
		
		list.add(price[index]);
		
		for(int i=list.size(); i>0; i--) {
			if(list.get(i)>=value) {
				count++;
			}
			else
				break;
		}
		
		}
		
		return count;
		
	}

}
