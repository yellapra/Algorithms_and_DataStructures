public boolean subArrayGivenSum(int[] a, int sum){
	if(a == null){
		return false;
	}
	int start=0;
	int current_sum = 0;
	for(int i= 0; i<a.length; i++){
		current_sum += a[i];
		if(current_sum > sum){
			current_sum = current_sum - a[start];
			start++;
		}
		if(current_sum == sum){
			System.out.println("SubArray found at indices" + start + "and" + i);
			return true;
		}

	}
	return false;
}