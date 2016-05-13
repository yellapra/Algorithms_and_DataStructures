public ArrayList<String> findAllPermutations(String str){
	ArrayList<String> permutations = new ArrayList<String>();
	if(str == null){
		return null;
	}
	if(str.length() == 0){
		permutations.add("");
		return permutations;
	}

	char start = str.charAt(0);
	String remainder = str.substring(1);
	ArrayList<String> perms = findAllPermutations(remainder);

	for(String word : perms){
		for(int i=0; i<word.length; i++)
		permutations.add(insertChar(start, word, i));
	}

	return permutations;
}

void insertChar(char s, String remainder, int i){
	String start = remainder.substring(0, i);
	String end = remainder.substring(i);
	return start + s + end;
}