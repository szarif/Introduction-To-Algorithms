public Results maxSubarrayLinear(int[] a) {
  int max = a[0];
  int currSum = a[0];

  int left = 0;
  int tempLeft = 0;
  int right = 0;
  Results R = new Results(left, right, max);

  for (int i = 1; i < a.length; i++) {

    //if current element is bigger than curr sum
    //we can reset sum
    //currSum = MAth.max(currSum + a[i], a[i]);
    if (currSum + a[i] > a[i]) {
      currSum = currSum + a[i];
      
    } else {
      currSum = a[i];
      //curr element is bigger than sum plus curr element, we should restart
      tempLeft = i;
    }

    if (currSum > max) {
      max = currSum;
      right = i;
      left = tempLeft;
    } 


  }
}
