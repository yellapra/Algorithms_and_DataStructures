import java.util.*;

class Test{
	
	public static void replaceSpaces(char[] str){
		
		int spaceCount = 0;
		for(int i= 0; i<str.length; i++){
			if(str[i] == ' '){
				spaceCount++;
			}
		}


		int newLength = str.length + spaceCount * 2;
		char[] newArray = new char[newLength];
		
		for(int i= str.length-1; i >=0; i--){
			 if(str[i] == ' ') {
				newArray[newLength-1] = '0';
				newArray[newLength-2] = '2';
				newArray[newLength-3] = '%';
				newLength = newLength - 3;
			} else {
				newArray[newLength-1] = str[i];
				newLength--;
			}
		}
		System.out.println(newArray);		
		//char [] result = Arrays.copyOf(str, newLength);
		//return result;
	}
}

public class ReplaceSpaces{
	
	public static void main(String args[]){
	
		char a[] = {'d',' ','i',' ','v',' ','y',' ','a'};
		Test.replaceSpaces(a);
	//	for(int i = 0; i<result.length; i++){
	//		System.out.print(result[i]);
	//	}
	}

}

