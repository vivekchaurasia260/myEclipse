package DemoProgram1;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Test123 extends A {

	public static void main(String[] args) throws IOException {
		
/*		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int k = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int b[] = new int[a];
		for(int i=0; i<a; i++) {
			int r = in.nextInt();
			b[i] = m>=n?getResult(r-k,m,n) : getResult(r-k,m,n);
		}
		for(int i=0; i<a; i++) {
			System.out.println(b[i]);
		}

	}
	
	public static int getResult(int a, int m, int n) {
		
		if(a<0)
			a = -a;
		if(a==m || a==n || a== m+n || a==m-n || a==0)
			return 1;
		
		return 0;
		
		*/
		
		
		 // ** IMP
//		Integer i = new Integer(258);
//		byte x = i.byteValue();
//		
//		System.out.println(x);
		
		
//		byte x=1;
//		x = (byte) (x*5);
//		System.out.println(x);
		
		
//		  URL obj = new URL("https://www.sanfoundry.com/javamcq");
//          URLConnection obj1 = obj.openConnection();
//          int len = obj1.getContentLength();
//          System.out.print(len);
		
		
//		String x = "flowowoo";
//		String y = "fl";
//		
//		System.out.println("The indexOf() method is: ");
//		//while(y.indexOf(x)!=0) {
//			System.out.println(x.indexOf(y));
	//	}
			
		
//		char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//		
//		List res = Arrays.asList(arr);
//		
//		System.out.println(res.indexOf('b'));
			
				
		
	}
	
	public static void print() {
		
		System.out.println("This is Child");
	}
	

}

class A {
	
	public static void print() {
		System.out.println("This is Parent");
	}
	
}
