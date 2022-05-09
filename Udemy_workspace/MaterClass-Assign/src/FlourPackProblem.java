
public class FlourPackProblem {
	
	public static void main(String[] args) {
		
		System.out.println(canPack(2,1,5));
		System.out.println(canPack(2,10,21));
		System.out.println(canPack(2,2,11));
		System.out.println(canPack(4, 18, 19));
		
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		
		if(bigCount<0 || smallCount<0 || goal<0)
			return false;
		
		if(smallCount+(5*bigCount)<goal)
			return false;
		
		return (goal%5<=smallCount);
	}
}
