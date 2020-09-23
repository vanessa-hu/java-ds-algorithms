//https://leetcode.com/problems/contains-duplicate/description/

import java.util.*;

class hasDuplicate {

// Runtime: 5 ms, faster than 82.65% of Java online submissions for Contains Duplicate.
// Memory Usage: 45.2 MB, less than 75.67% of Java online submissions for Contains Duplicate.
    public boolean containsDuplicate(int[] nums) {
      
      HashSet<Integer> visited = new HashSet<>();
      
      for (int num : nums) {
          if (visited.contains(num)) return true;
          visited.add(num);
      }
      
      return false;
  }
}

