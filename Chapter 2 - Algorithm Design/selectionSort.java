public void selectionSort(int[] A) {

  for (int i = 0; i < A.length; ++i) {
    int minIndex = i;

    for (int j = i + 1; j < A.length; ++j) {
      if (A[j] < A[minIndex]) {
        minIndex = j;
      }
    }

    if (minIndex != i) {
      int temp = A[i];
      A[i] = A[minIndex];
      A[minIndex] = templ
    }
    
  }

}