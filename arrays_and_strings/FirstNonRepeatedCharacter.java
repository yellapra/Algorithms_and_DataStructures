import java.util.*;

public class FirstNonRepeatedCharacter {

	public static char FirstNonRepeatedChar(String s) {

		if(s == null) {
			return '\0';
		}

		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		char ch = '\0';
		for(int i=0; i<s.length(); i++) {
			if(!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), 1);
			} else {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			}
		}

		for(int i=0; i<s.length(); i++) {
			if(hm.get(s.charAt(i)) == 1) {
				ch = s.charAt(i);
				break;
			}
		}

		return ch;
	}

	public static void main(String args[]) {
		char ch = FirstNonRepeatedCharacter.FirstNonRepeatedChar("cccadteeter");
		System.out.println(ch);
	}
}
