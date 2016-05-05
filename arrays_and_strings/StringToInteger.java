import java.util.*;

public class StringToInteger {

	public static int convertStringToInt(String s) {
		boolean isNeg = false;
		int i = 0, num = 0;
		if(s == null) {
			return;
		}
		if(s.charAt(i) == '-') {
			isNeg = true;
			i = 1;
		}

		while(i<s.length()) {
			if(!(Character.isDigit(s.charAt(i))){
				System.out.println("Enter a valid string that contains only numbers!");
				return;
			}
			num = num * 10;
			num = num + s.charAt(i) - '0';
			i++;
		}

		if(isNeg) {
			num *= -1;
		}

		return num;
	}

	public static void main(String args[]) {
		int result = StringToInteger.convertStringToInt("-12345");
		System.out.println(result);
	}
}
