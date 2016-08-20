public int[] insertionSort(int[] arr) {
  int size = arr.length - 1;

  for (int i = 1; i < size; i++) {
    int key = arr[i];

    int j = i - 1;

    while (j >= 0 && key < arr[j]  ) {
      //push elements to the right
      //next el = to curr el
      arr[j+1] = arr[j];
      j--;
    }

    arr[j+1] = key;




  }
}