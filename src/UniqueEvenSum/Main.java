package UniqueEvenSum;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int nums[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int total = UserMainCode.addUniqueEven(nums,n);
		if(total >= 0) {
			System.out.println(total);
		}else {
			System.out.println("no even numbers");
		}
		
		sc.close();
	}

}
