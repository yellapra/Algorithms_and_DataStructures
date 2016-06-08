
//If sum of all integers is odd, then we cannot divide the array into 2 parts having same sum, return false
//Else compute the sum and search for sum/2 in the array including and excluding the last element recursively
public boolean subArray(int[] a){
	if(a == null){
		return false;
	}
	int sum = 0;
	int size = a.length;
	for(int i=0; i<size; i++){
		sum += a[i];
	}
	if(sum%2!=0){
		return false;
	}
	else{
		return sameSumAubArray(a, size, sum/2);
	}
}
public boolean sameSumAubArray(int[] a, int size, int sum){
	if(sum == 0){
		return true;
	}
	if(size==0 && sum != 0){
		return false;
	}
	if(a[size-1] > sum){
		sameSumAubArray(a, size-1, sum);
	}
	return (sameSumAubArray(a, size-1, sum) || sameSumAubArray(a, size-1, sum - a[size-1]))
}
