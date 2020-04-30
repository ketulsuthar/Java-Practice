package stringoccurences;

public class UserMainCode {

	public static int countNoOfWords(String str1, String str2) {
		
		String[] s1 = str1.split(" ");
		String[] s2 = str2.split(" ");
		
		int count = 0;
		for(int i = 0; i < s1.length;i++) {
			
				if(s1[i].equals(s2[1]))
					count++;
		}
		
		return count;
	}
}
