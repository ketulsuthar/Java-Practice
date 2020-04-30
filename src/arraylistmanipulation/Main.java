package arraylistmanipulation;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		
		
		int n = sc.nextInt();
		for(int i=0; i<n;i++) {
			array1.add(sc.nextInt());
		}
		for(int i=0; i<n;i++) {
			array2.add(sc.nextInt());
		}
		
		for(Object i :UserMainCode.generateOddEvenList(array1,array2)) {
			
			System.out.println(i);
		}
		
		
		sc.close();
	}

}
