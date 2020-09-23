
class maxSubArray {
  //https://leetcode.com/problems/maximum-subarray/description/
  // solution: https://www.youtube.com/watch?v=esmNXzaverI&feature=youtu.be

// this is O(n)!
// solution https://www.youtube.com/watch?v=coVjZ_3-_gs
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
// Memory Usage: 39.3 MB, less than 84.98% of Java online submissions for Maximum Subarray.
    public static int maxSub(int[] nums) {
      int len = nums.length;
      if (len == 0) return 0;
      bestTotal = nums[0];
      currTotal = nums[0];

      for (int i = 1; i < len; i++) {
        //same as doing currTotal = Math.max(curr + nums[i], nums[i]);
        currTotal = (currTotal > 0) ? (currTotal + nums[i]) : nums[i];
        bestTotal = math.max(currTotal, bestTotal);
      }

    return bestTotal;
    }


}