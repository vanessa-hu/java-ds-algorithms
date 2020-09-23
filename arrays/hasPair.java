class hasPair {

// 2 INPUT: SORTED array of ints & a sum (int)
// OUTPUT: whether 2 els in the array sum to the given sum
// EX: [1, 2, 3, 9] 8
// EX: [1, 2, 4, 4] 8
// POSSIBLE OTHER: type checks, if array is null, if want to remember which elements
//prioritize time > space

//  BRUTE FORCE: nested loop.
// memory :) time O(n^2)
import java.util.HashSet;

public static boolean hasPairWithSum(int[] arr, int sum) {
  int len = arr.length;
  for (int i = 0; i < len; i++) {
    for (int j = i + 1; i < len; j++) {
      if (arr[i] + arr[j] == sum) {
        return true;
      }
    }
  }
  return false;
}

public static boolean hasPairWithSum2(int[] arr, int sum) {
  //pointers at beg / end
  // space: O(1) nothing
  // time: O(n)
  int lo = 0;
  int hi = arr.length - 1;
  // before pointers collide
  while (lo < hi) {
    int currSum = arr[lo] + arr[hi];
    if (currSum < sum) {
      lo++;
    }
    else if (currSum > sum) {
      hi--;
    }
    else {
      return true;
    }
  }
  return false;
}

public static boolean hasPairWithSum3(int[] arr, int sum) {
  // if array is unordered??
  // if not in set, then add the num's complement (so basically on lookout for complements)
  // space: O(n)
  // time: O(n)
  HashSet<Integer> comps = new HashSet<>();
  for (int num : arr) {
    // if the num is a complement that would match any of the arr
    if (comps.contains(num)) {
      return true;
    }
    // add a complement to look out for
    comps.add(sum - num);
  }
  return false;
  

}


}