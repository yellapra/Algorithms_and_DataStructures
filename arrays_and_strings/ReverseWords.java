import java.util.*;

public class ReverseWords {

	public static String reverseWords(String s) {
		String[] word_array = s.split(" ");
		StringBuffer sb = new StringBuffer(s.length());
		for(int i= word_array.length-1; i>=0; i--) {
			if(i == 0) {
				sb.append(word_array[i]);
			}
			else{
				sb.append(word_array[i]+ " ");
			}
		}

		return sb.toString();
	}

	public static void main(String args[]) {
		String result = ReverseWords.reverseWords("piglet quantum");
		System.out.println(result);
	}
	
}