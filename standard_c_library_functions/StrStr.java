import java.util.*;
public class StrStr {

	public static int strstr(String string_to_search, String substring) {

		if(string_to_search == null || substring == null) {
			return -1;
		}

		if(string_to_search.length() < substring.length()) {
			return -1;
		}

		for(int i=0; i<string_to_search.length(); i++) {
			if(i+substring.length() > string_to_search.length()) {
				return -1;
			}
			//Store starting index in the original string to return if there's a match
			int m = i;
			for(int j=0; j<substring.length();j++){
				//If first char is equal, compare j chars until not equal
				if(string_to_search.charAt(m) == substring.charAt(j)) { 
					if(j == substring.length()-1) {
						return i;
					}
					m++;
				}else {
					//Not eqaul so break out of the loop and increment i in the original string and start pattern match from there
					break;
				}
			}
		}

		return -1;
	}
}