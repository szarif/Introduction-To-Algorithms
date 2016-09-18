public class Results {
  int first;
  int last;
  int sum;
}

public results maxSubarray(int[] a, int low, int high) {
  if( low == high ) {
    // we have only one element
    // the sum is equal to that element so far
    return results(low, high, a[low]);
  } else {
    Results middle = (low + high) / 2;
    //get left max subarray
    Results left = maxSubarray(a, low, middle);
    //get right max subarray
    Results right = maxSubarray(a, middle+1, high);
    //get crossing max subarray
    Results crossing = maxCrossingSubarray(a, low, middle, high);

    return getMax(left, right, crossing);
  }
}

public Results maxCrossingSubarray(int[] a, int low, int mid, int high) {
  //try to find highest serious from middle to low
  //left subarray
  int leftSum = 0;
  int leftIndex = -1;
  int leftMaxSum = Math.minInteger();
  for (int i = mid; i >= 0; i--) {
    leftSum += a[i];
    if(leftSum >  leftMaxSum) {
      leftMaxSum = leftSum;
      leftIndex = i;
    }
  }

  //try to find highest serious from middle+1 to high
  //right subarray
  int rightSum = 0;
  int rightIndex = -1;
  int rightMaxSum = Math.minInteger();
  for (int i = mid+1; i <= high; i++) {
    rightSum += a[i];
    if(rightSum > rightMaxSum) {
      rightMaxSum = rightSum;
      rightIndex = i;
    }
  }

  return results(leftIndex,rightIndex,leftMaxSum + rightMaxSum);
}

public Results getMax(Results a, Results b, Results c) {
  if (a.sum >= b.sum && a.sum >= c.sum) return a;
  else if (b.sum >= a.sum && b.sum >= c.sum) return b;
  else return c;
}