public ArrayList<ArrayList<Integer>> findAllSubSets(ArrayList<Interger> set){
	if(set == null){
		return null;
	}
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	int total_subsets = Math.pow(2, set.size());
	for(int i = 0; i<total_subsets; i++){
		ArrayList<Integer> subset = new ArrayList<Integer>();
		int current_subset = i;
		int index = 0;
		while(current_subset>0){
			if(current_subset & 1 >0){
				subset.add(set(get(index)));

			}

			current_subset = current_subset >> 1;
			index++;
		}
		result.add(subset);
	}
	return result;
}
