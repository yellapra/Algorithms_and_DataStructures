import java.util.*;

public class RemoveSpecifiedChars {

	public static String removeSpecifiedChars(String str, String remove) {
		char[] s = str.toCharArray();
		char[] r = remove.toCharArray();
		boolean[] lookUpArray = new boolean[128];
		int src = 0;
		int dst = 0;

		for(int i=0; i<r.length; i++) {
			lookUpArray[r[i]] = true;
		}

		while(src < s.length) {
			if(!lookUpArray[s[src]]) {
				s[dst++] = s[src];
			}
			src++;
		}

		return new String(s, 0, dst);

	}

	public static void main(String args[]) {
		String s = RemoveSpecifiedChars.removeSpecifiedChars("Divya is burning the midnight oil" , "aeiou");
		System.out.println(s);
	}
}