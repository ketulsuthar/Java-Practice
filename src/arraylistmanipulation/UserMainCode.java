package arraylistmanipulation;

import java.util.ArrayList;

public class UserMainCode {

	public static ArrayList generateOddEvenList(ArrayList<Integer> a1, ArrayList<Integer> a2) {
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		
		for(int i =0; i < a1.size(); i++) {
			if (i%2 ==0) {
				a3.add(a2.get(i));
			}else {
				a3.add(a1.get(i));
			}
		}
		
		return a3;
	}
}
