
public class MegaByteConverter {
	public static void main(String[] args) {
	
		printMegaBytesAndKiloBytes(2500);				
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		if(kiloBytes < 0)
			System.out.println("Invalid Value");
		else {
			int megaByte=kiloBytes/1024;
			int kiloB=kiloBytes%1024;
			System.out.println(kiloBytes+" KB = "+megaByte+" MB and "+kiloB+" KB");
			
		}
			
	}
}
