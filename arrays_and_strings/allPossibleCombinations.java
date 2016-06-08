//Call with allPossibleCombinations(a, n, r, 0, combinations, 0);
public void allPossibleCombinations(int[] a, int n, int r, int combination_index, int[] combinations, int array_index){

	if(array_index == r){
		for(int i = 0; i<combinations.length; i++){
			System.out.print(combinations[i]+ " ");
		}
	}

	if(array_index>=n){
		return;
	}

	combinations[combination_index] = a[array_index];
	allPossibleCombinations(a, n, r, combination_index+1, combinations, array_index+1);//Include that element
	allPossibleCombinations(a, n, r, combination_index, combinations, array_index+1);//Exclude that element
}
