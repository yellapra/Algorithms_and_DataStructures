
//BruteForce is to have 2 loops, outer starting at i=0 and inner starting at j=i and finding sum of all sub arrays. Takes O(n^2). 
//This is O(n)
public boolean subArraySumZero(int[] a){
	if(a == null){
		return false;
	}
	HashMap<Integer> hm = new HashMap<Integer>();
	int sum = 0;
	for(int i=0; i<a.length; i++){
		sum = sum + a[i];
		if(a[i]==0 || sum == 0 || hm.get(sum)!=null){
			return true;
		}
		hm.put(a[i],i);
	}
	return false;
}