//https://stackabuse.com/sorting-algorithms-in-java/
import java.util.*;

public class SelectionSort {
//O(n), space O(1)

  public static void sort(int[] arr) {
    int len = arr.length;
    for (int i = 0; i < len - 1; i++) {
      boolean inOrder = true;
      int smallestInd = i;
      // 0 1 2 3 = i
      // 3 4 7 1 2 
      // j = 4. //smallest = 3 ind
      for (int j = i + 1; j < len; j++) {
        if (arr[j] < arr[smallestInd]) {
          smallestInd = j;  inOrder = false; //can take away inOrder stuff for simplest
        } 

      }
    // temp 3. 
      if (inOrder) return;
      int temp = arr[i];
      arr[i] = arr[smallestInd];
      arr[smallestInd] = temp;


    }
  }

    public static void main(String[] args) {
      int[] nums = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
      sort(nums);
      System.out.println(Arrays.toString(nums));
    }


  

}