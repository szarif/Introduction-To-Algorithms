4.1.1
the largest element

4.1.2
brute force for max findMaxSubarray
-2,3,1,-4,3,-1,3,100

Results findMaxSubarray(int[] a) {
  int leftIndex = -1;
  int rightIndex = -1;
  int maxSum = math.min();
  int currSum = 0;

  for (int i = 0; i < a.length; ++i) {
    currSum = 0;
    //try curr index
    for (int j = i; j < a.length ++j) {
      currSum += a[j];
      if (currSum > maxSum) {
        maxSum = currSum;
        leftIndex = i;
        rightIndex = j;
      }
    }
  }
}