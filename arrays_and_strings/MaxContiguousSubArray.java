//Max contiguous sub array
public int maxSum(int[] a){
	int current_max = a[0];
	int max_so_far = a[0];
	for(int i=0; i<a.length; i++){
		current_max = max(a[i], current_max + a[i]);
		max_so_far = max(max_so_far, current_max);
	}
	return max_so_far;
}

//Min contiguous sub array
public int minSum(int[] a){
	int current_min = a[0];
	int min_so_far = a[0];
	for(int i=0; i<a.length; i++){
		current_min = min(a[i], current_min + a[i]);
		min_so_far = min(min_so_far, current_min);
	}
	return min_so_far;
}