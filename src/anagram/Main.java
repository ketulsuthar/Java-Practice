package anagram;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(UserMainCode.getAnagram(s1, s2) < 0) {
			
			System.out.println("Not Anagram");
			
		}else {
			
			System.out.println("Anagram");
			
		}
		
		sc.close();
	}

}
