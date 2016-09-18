public int evaluate(int[] arr, int power) {
  //results initialized to first term
  int results = arr[0];

  for (int i = 1; i < arr.length; i++) {
    results = results*x + arr[i];
  } 

  return results;
}