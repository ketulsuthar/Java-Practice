package stringUnique;

public class UserMainCode {

	public static String replacePlus(String str1, String str2) {
		
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < str1.length(); i++) {
			
			char c = s1.charAt(i);
			if(s2.indexOf(c)== -1) {
				sb.append('+');
			}else {
				sb.append(str1.charAt(i));
			}
		}
		
		
		return sb.toString();
	}
}
