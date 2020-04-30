package UniqueEvenSum;

public class UserMainCode {
	
	public static int addUniqueEven(int[] nums,int n) {
		
		int i , j, total;
		i=0;
		j = n-1;
		total = -1;
		while (i < j){
			if (nums[i] % 2 == 0)
				total += nums[i];
			if (nums[j] % 2 == 0)
				total += nums[j];
			i++;
			j--;
			if(i == j && nums[i] % 2 == 0) {
				total += nums[i];
			}
		}
				
		return total >= 0 ? total+1:-1;
	}

}
