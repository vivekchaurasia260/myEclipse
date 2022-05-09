import java.util.ArrayList;
import java.util.List;

public class ArrayList_Prg {
	public static void main(String[] args) {
		
		List<List<Integer>> seqList = new ArrayList<List<Integer>>();
        List<Integer> ansList = new ArrayList<Integer>();
        int lastAnswer = 0;
        for(int i=0; i<2; i++) {
            seqList.add(new ArrayList<Integer>());
        }
        
        seqList.get(1).add(5);
        seqList.get(1).add(34);
        seqList.get(0).add(17);
		
		
		System.out.println(seqList);
	
		
	}

}
