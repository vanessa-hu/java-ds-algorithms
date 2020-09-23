import java.util.*;

//Leetcode Problems
public class twoSumQ {


// Given an array of integers nums and and integer target, return the indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// https://leetcode.com/problems/two-sum/
// You can return the answer in any order

// Runtime: 1 ms, faster than 99.96% of Java online submissions for Two Sum.
// Memory Usage: 40.2 MB, less than 40.73% of Java online submissions for Two Sum.

  public static int[] twoSum(int[] nums, int target) {
      // input: unsorted array and target
      // non empty, exactly one solution
      //output: below array
      
      //naive brute force: O(n^2). nested loops
      //map from a passed num to its index.  no repeated nums unless needed; aka 4 + 4
      Map<Integer, Integer> passed = new HashMap<>();
      int[] inds = new int[2];
      int len = nums.length;
      
      for (int i = 0; i < len; i++) {
          int curr = nums[i];
          if (passed.containsKey(target - curr)) {
              inds[0] = i; inds[1] = passed.get(target - curr);
              break;
          }
          passed.put(curr, i);
      }
      return inds;  
      
      
  }

}