//Call allPossiblePartitions(str, str.length(), "");

public void allPossiblePartitions(String str, int size, String result){
	for(int i = 1; i<=size; i++){
		String prefix = str.substring(0,i);
		if(dictionaryContains(prefix)){
			if(i == size){
				result = result + prefix;
				System.out.println(result);
				return;
			}
			allPossiblePartitions(str.substring(i), size-i, result + prefix + " ");
		}
	}
}