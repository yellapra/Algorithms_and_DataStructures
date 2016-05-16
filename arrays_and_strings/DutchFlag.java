
//Sort 0, 1, 2s

public void dutchFlag(int[] a){
  int low = 0;
  int mid = 0;
  int high = a.length - 1;
  
  while(mid <= high){
    switch(a[0]){
      
      case 0:
        int temp = a[low];
        a[low] = a[mid];
        a[mid] = temp;
        low++;
        mid++;
        break;
        
      case 1:
        mid++;
        break;
        
      case 2:
        int temp = a[high];
        a[high] = a[mid];
        a[mid] = temp;
        high--;
        break;
    }
  }
}
