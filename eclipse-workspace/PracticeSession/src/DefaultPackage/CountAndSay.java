package DefaultPackage;

import java.util.Scanner;

public class CountAndSay {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		String result = countAndSay(num);
		
		System.out.println(result);
		
	}
	
	
	public static String countAndSay(int n) {		
		
		String res="11";
		int k;
		if(n<=0)
			return "";
		
		if(n==1)
			return "1";
		  
        int count=1;

        for(int i=0; i<n; i++) {
        	
          for(k=0; k<res.length()-1; k++) {
        	  count=1;
            for(int j=k+1; j<res.length(); j++) {
                
                if(res.charAt(k)==res.charAt(j)) {
                    count++;
                }
                else
                    break;
            }
            
           // res = count+""+res.charAt(k);
            
            
            System.out.println("At particular Index : "+res.charAt(k));
            
        }
          res = count+""+res.charAt(k);
        }
        
        return res;
        
	}

}
