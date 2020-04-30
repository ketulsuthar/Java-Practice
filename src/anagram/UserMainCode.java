package anagram;

import java.util.Arrays;

public class UserMainCode {

	public static int getAnagram(String s1, String s2) {
		
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		
		char s1A[] = s1.toCharArray();
		char s2A[] = s2.toCharArray();
		
		Arrays.sort(s1A);
		Arrays.sort(s2A);
		
		if (new String(s1A).equals(new String(s2A))) {
			return 1;
		}
		return -1;
	}
}
