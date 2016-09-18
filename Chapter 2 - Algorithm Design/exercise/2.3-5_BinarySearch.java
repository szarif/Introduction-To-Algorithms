public int binarySearchIter(int target, int[] arr) {
  int start = 0;
  int end = arr.length;

  while (start < end) {
    int middle = (start + end) / 2;

    if (target < arr[middle]) {
      end = middle;
    } else if (target > arr[middle]) {
      start = middle + 1;
    } else {
      return middle;
    }
  }

  return -1;
}