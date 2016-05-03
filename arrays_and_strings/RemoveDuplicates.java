import java.util.*;
class Duplicates{
public  static int[] removeDuplicates(int[] arr) {

    int end = arr.length;

    for (int i = 0; i < end; i++) {
        for (int j = i + 1; j < end; j++) {
            if (arr[i] == arr[j]) {                  
                int shiftLeft = j;
                for (int k = j+1; k < end; k++, shiftLeft++) {
                    arr[shiftLeft] = arr[k];
                }
                end--;
                j--;
            }
        }
    }
	int[] whitelist = new int[end];
    	for(int i = 0; i < end; i++){
        	whitelist[i] = arr[i];
    	}
    return whitelist;

}

public static int[] remDup(int[] arr){
int len = arr.length;
Set<Integer> alreadyPresent = new HashSet<>();
int [] noDup = new int[len];
int a = 0;
for (int i : arr){
	if(alreadyPresent.add(i)){
		noDup[a] = i;
		a++;
	}
}
return Arrays.copyOf(noDup,a);
}

}

public class RemoveDuplicates{

	public static void main(String args[]){
	
	int[] duplicate_array = {10,9,10,10,7,3,3,7,7};
	int[] result = Duplicates.removeDuplicates(duplicate_array);
	int[] result1 = Duplicates.remDup(duplicate_array);
	for(int i= 0; i<result.length; i++){
		System.out.println(result[i]);
		}
	for(int i= 0; i<result1.length; i++){
                System.out.println(result[i]);
                }
	}
}
