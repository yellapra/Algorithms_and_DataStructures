import java.util.*;

public class IntegerToString {

	public static String integerToString(int num) {

		boolean isNeg = false;
		int i= 0;
		char[] temp = new char[11];
		StringBuffer sb = new StringBuffer();

		if(num < 0) {
			isNeg = true;
		}

		do {
			temp[i] = (char) ((num%10) + '0');
			num = num/10;
			i++;
		} while(num != 0);

		if(isNeg) {
			sb.append('-');
		}

		for(i=temp.length-1; i>=0; i--) {
			sb.append(temp[i]);
		}

		return sb.toString();

	}

	public static void main(String args[]) {
		System.out.println(IntegerToString.integerToString(2));
	}
}
