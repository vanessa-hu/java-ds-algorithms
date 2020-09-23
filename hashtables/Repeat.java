import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
class Repeat {

//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined

//Bonus... What if we had this:
// [2,5,5,2,3,5,1,2,4]
// return 5 because the pairs are before 2,2

// 1) input is an array, output is the repeated int
// 2) value
// 3) naive approach: two nested loops, time n^2 so not best
// 4) possible breaks/bottlenecks: then n^2. what to return if not found?
// 5) set plan: create hashset, access O(1). will loop once in array
// 6) potential edge cases: if not found, empty array
// 7) go thru examples:
// 8) evaluate + improvements: O(n) for time! but space complexity is O(n) so potential drawback

  // class NoRepeatException extends Exception {

  // }

  public int firstRepeatedInt(int[] nums) {
    //if (nums.length == 0) return -100000;
    HashSet<Integer> seen = new HashSet<>();

    for (int num : nums) {
      if (seen.contains(num)) return num;
      seen.add(num);
    }

    //throw new NoRepeatException();
    return -100000;

  }

  public static void main(String[] args) {
    Repeat r = new Repeat();
    System.out.println(r.firstRepeatedInt(new int[] {1,5,5,1,3,4,6})); //5
    System.out.println(r.firstRepeatedInt(new int[] {2,5,5,2,3,5,1,2,4}));//5, not 2
    System.out.println(r.firstRepeatedInt(new int[] {2,1,1,2,3,5,1,2,4})); //1
    System.out.println(r.firstRepeatedInt(new int[] {2,3,4,5})); //throw exception
    
  }


}