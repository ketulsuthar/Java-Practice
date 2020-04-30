package masteringhashmap;

import java.util.HashMap;
import java.util.Iterator;

public class UserMainCode {

	public static int getAverageOfOdd(HashMap<Integer,Integer> hmap) {
		
		Iterator<Integer> itr = hmap.keySet().iterator();
		int total,count;
		total=count=0;
		while(itr.hasNext()) {
			int key = itr.next();
			if (key %2 != 0) {
				count++;
				total+=hmap.get(key);
			}
		}
		return total/count;
	}
}
