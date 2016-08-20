
public void mergeSort(int[] A, int start, int end) {
  if (start < end) {
    int middle = ( start + end ) / 2;
    //left
    mergeSort(A, start, middle);
    //right
    mergeSort(A, middle + 1, end);
    //combine
    merge(A, start, middle, end);
  }
}

//p = start
//q = middle
//r = end
public void merge(int[] A, int start, int middle, int end) {
  //define length of the two sub arrays
  int n1 = middle - start + 1; 
  int n2 = end - middle;

  //create two arrays
  int left = new int[n1 + 1];
  int right = new int[n2 + 1];

  //fill in the two arrays
  for (int i = 0; i < n1; i++ ) {
    left[i] = A[start + i]; //-1??
  }

  for (int j = 0; i < n2; j++ ) {
    right[j] = A[middle + j];
  }

  //add sentinal value
  left[i] = math.max();
  right[j] = math.max();

  //reset i and j
  i = 0;
  j = 0;

  //merge
  for (k = start; k < end; k++ ) {
    if(left[i] <= right[j]) {
      A[k] = left[i];
      i++; 
    } else {
      A[k] = right[j];
      j++;
    }
  }
}