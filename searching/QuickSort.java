class QuickSort{
	public int quickSort(int [] a, int low, int high){
		int pivot = a[high];
		int i = low-1;

		for(int j=low; j<high; j++){
			if(a[j] <= pivot){
				i++;

				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}

		int temp = a[i+1];
		a[i+1] = pivot;
		pivot = a[i+1];

		return i+1;

	}

	public void sort(int[] a, int low, int high){
		if(low < high){
			int pivot = return quickSort(a, low, high);

			quickSort(a, low, pivot-1);
			quickSort(a, pivot+1, high);
		}
	}
}