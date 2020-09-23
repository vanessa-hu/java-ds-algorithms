//https://stackabuse.com/sorting-algorithms-in-java/
import java.util.*;

public class MergeSort {
//O(n log n), space O(n)

  public static void sort(int[] arr) {
    sort(arr, 0, arr.length - 1);


  }
  public static void sort(int[] arr, int left, int right) {
    //int len = right - left + 1; // len 3. 0 and 2
    if (right <= left) return; // 2 1
    int mid = (left + right)/2; //3 // 1
    sort(arr, left, mid);
    sort(arr, mid + 1, right); //2, 2
    merge(arr, left, mid, right);

    // 3 5 1 7 | 4 9 2 3
  }// mid & right is incl,

  private static void merge(int[] arr, int left, int mid, int right) {
    // 3 5 1 7 | 0,1, 3
    // 0 3 6
    int lenLeft = mid - left + 1; int[] leftAr = new int[lenLeft];
    int lenRight = right - mid; int[] rightAr = new int[lenRight];

    //store temp arrays
    for (int i = 0; i < lenLeft; i++) {
      leftAr[i] = arr[left + i];
    }
    for (int i = 0; i < lenRight; i++) {
      rightAr[i] = arr[mid + i + 1];
    }
    //keep track of arrays while combining
    int lPt = 0; int rPt = 0;
    for (int i = left; i < right + 1; i++) {

      if (lPt < lenLeft && rPt < lenRight) {

        if (leftAr[lPt] < rightAr[rPt]) arr[i] = leftAr[lPt++];
        else arr[i] = rightAr[rPt++];

      }
      else if (lPt < lenLeft) arr[i] = leftAr[lPt++];
      else if (rPt < lenRight) arr[i] = rightAr[rPt++];

    }

  }


  

    public static void main(String[] args) {
      int[] nums = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
      sort(nums);
      System.out.println(Arrays.toString(nums));
    }


  

}