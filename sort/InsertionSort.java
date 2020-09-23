//https://stackabuse.com/sorting-algorithms-in-java/
import java.util.*;

public class InsertionSort {
//O(n^2), space O(1)

  public static void sort(int[] arr) {
    int len = arr.length;
    // 1   3  4 | 2. i 2!
    // 1   3  2  | 4 i 1
    //  1  2  3  | 4 i = 0
    // 1   3  4 | 2. end = 2, i = 2, curr = 2
    // 1  3  3 | 4 i = 0

    for (int end = 0; end < len - 1; end++) {
      int curr = arr[end+1];
      int i = end;
      while (i > -1 && curr < arr[i]) {
        arr[i+1] = arr[i];
        i--;
      }
      arr[i+1] = curr;
      }
      
      // int curr = arr[end+1];
      // for (int i = end; i > -1; i--) {

      //   if (curr < arr[i]) {

      //     arr[i+1] = arr[i];
      //     arr[i] = curr;

      //   }
      //   else break;
      // }

    }
    
  

    public static void main(String[] args) {
      int[] nums = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
      sort(nums);
      System.out.println(Arrays.toString(nums));
    }


  

}

