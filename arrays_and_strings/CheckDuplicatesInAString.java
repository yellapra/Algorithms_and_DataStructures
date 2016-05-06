import java.util.*;

//Brute force method is to compare every character with every other character in the string. O(n^2). No extra space
//Another method is to sort the string and check linearly for duplicated characters. O(nlogn)

//Using extra space, this algorithm is O(n)

public class CheckDuplicatesInAString {
	public static boolean checkDuplicates(String s) {
		if(s == null) {
			return false;
		}
		boolean check_dup = new boolean[256];//ASCII, 65536 for unicode
		for(int i=0; i<s.length(); i++) {
			if(check_dup[s.charAt(i)]){
				return false;
			}
			check_dup[s.charAt(i)] = true;
		}
		return true;
	}
}