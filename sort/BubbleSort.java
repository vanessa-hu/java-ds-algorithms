import java.util.*;
//https://stackabuse.com/sorting-algorithms-in-java/
class BubbleSort {

//Time O(n^2), best O(n)


  public static void sort(int[] arr) {
    int len = arr.length;
    for (int i = 0; i < len - 1; i++) {
      for (int j = 0; j < len - 1; j++) {
        int fst = arr[j];
        int sec = arr[j+1];
        if (fst > sec) {
          arr[j] = sec; arr[j+1] = fst;
        }

      }
    }

    
  }

  public static void main(String[] args) {
    int[] nums = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
    sort(nums);
    System.out.println(Arrays.toString(nums));

  }
}