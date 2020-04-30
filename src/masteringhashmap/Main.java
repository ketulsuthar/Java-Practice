package masteringhashmap;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < n; i++) {
			
			hmap.put(sc.nextInt(), sc.nextInt());
		}
		
		System.out.println(UserMainCode.getAverageOfOdd(hmap));
		
		sc.close();
	}

}
