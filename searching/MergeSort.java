class MergeSort{

	public void merge(int[] arr, int low, int mid, int high){
		int a[] = new int[mid-low+1];
		int b[] = new int[high-mid];

		for(int i = 0; i< (mid-low+1); i++){
			a[i] = arr[low+i];
		}
		for(int j = 0; j< high-mid; j++){
			b[j] = arr[mid+1+j];
		}

		int i=0, j=0, k=0;
		while(i<mid && j<high){
			if(a[i] <= b[j]){
				arr[k] = a[i];
				i++;
			}else{
				arr[k] = b[j];
				j++;
			}
			k++;
		}

		while(i < mid){
			arr[k] = a[i];
			i++;
			k++;
		}
		while(j < high){
			arr[k] = b[j];
			j++;
			k++;
		}
	}




	public void MergeSort(int[] a, int low, int high){
		if(low<high){
			int mid = (low+high)/2;
			MergeSort(a, low, mid);
			MergeSort(a, mid+1, high);

			merge(a, low, mid, high);
		}
	}
}