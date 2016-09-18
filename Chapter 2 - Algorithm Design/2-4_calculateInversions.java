public int mergeSort(int arr, int start, int end) {
  if (start < end) {
    int middle = (start + end) / 2;
    //middle is inclusive
    count += mergeSort(arr, start, middle);
    count += mergeSort(arr, middle + 1, end);
    count += merge(arr, start, middle, end)
  } else {
    return 0;
  }
}

public int merge(int arr, int start, int middle, int end) {
  int leftN = middle - start + 1;
  int rightN = end - middle;
  int count = 0;

  int[] left;
  int[] right;

  //fill in left array
  for (int i = 0; i < leftN; ++i) {
    leftN[i] = arr[start+i];
  }

  //fill in right array
  for (int j = 0; i < rightN; ++j) {
    leftN[j] = arr[middle+j+1];
  }

  i = 0;
  j = 0;

  for (int k = start; k <= end; ++k) {

    //easier and better answer would be:
    if (j >= rightN || (i<leftN && left[i] <= right[j]) ) {
      //here we know i < leftN
      //and left[i] <= right[j]
      arr[k] = left[i];
      ++i;
    } else {
      //here we know j < rightN so it won't be out of bound
      //and right[j] < left[i]

      //left[i] > right[j] we need to swap! and we have an inversion!
      //count += ledtN - 1 because we need to sum counts
      //if an element on the right(sorted) is smaller than an element on the left (sorted) than it is smaller
      //than all elements after it on the left and thus we add the inversions
      //size of left - how many iterations have passed!
      count += leftN - i;
      arr[k] = right[j];
      ++j;
    }



/*** other solution I don't like ***/

  //   //the left will always be empty first
  //   if(j >= leftN) {
  //     //no more elements on the left insert right elements
  //     arr[k] = right[j];
  //     ++j;
  //   } else if(i >= rightN) {
  //     //no more elements on the left insert right elements
  //     arr[k] = left[i];
  //     ++i;
  //   } else if(left[i] <= right[j]) {
  //     arr[k] = left[i];
  //     ++i;
  //   } else {
  //     //left[i] > right[j] we need to swap! and we have an inversion!
  //     //count += ledtN - 1 because we need to sum counts
  //     //if an element on the right(sorted) is smaller than an element on the left (sorted) than it is smaller
  //     //than all elements after it on the left and thus we add the inversions
  //     //size of left - how many iterations have passed!
  //     count += leftN - i;
  //     arr[k] = right[j];
  //     ++j;
  //   }
  // }

  return count;
}