
public class Demo1 {
	public static void main(String[] args) {
		
		char switchValue='E';
		
		switch(switchValue) {
		
		case 'A': 
			System.out.println("Value was A");
			break;
		case 'B':
			System.out.println("Value was B");
			break;
		case 'C':
			System.out.println("Value was C");
			break;
		case 'D':case 'E':
			System.out.println("Value was D and E");
			break;
		default:
			System.out.println("Value was no A, B, C, D");
		
		}
	}

}
