
//merge two sorted arrays of integers
// inputs: two arrays
// outputs:
// other cases: 2 empty, 1 empty, 1/2 null

// main value: time? space?

import java.util.Arrays;

class mergeSorted {
  //initial thought
  public static int[] merge(int[] arr1, int[] arr2) {
    if (arr1 == null && arr2 == null) return arr2;

    // new arr, assumes none are null
    
    if (arr1 == null || arr1.length == 0) return arr2; if (arr2 == null || arr2.length == 0) return arr1;
    int len1 = arr1.length; int len2 = arr2.length;
    int fullLen = len1 + len2;
    int[] newArr = new int[fullLen];

    //pointers
    int p1 = 0;
    int p2 = 0;

    for (int i = 0; i < fullLen; i++) {
      if (p1 < len1 && p2 < len2) {
        if (arr1[p1] <= arr2[p2]) {
          newArr[i] = arr1[p1]; p1++;
        }
        else {
          newArr[i] = arr2[p2]; p2++;
        }
      }
      else if (p1 < len1) {
        newArr[i] = arr1[p1]; p1++;
      }
      else {
        newArr[i] = arr2[p2]; p2++;
      }
    }
    return newArr;

  }

  public static int[] merge2(int[] arr1, int[] arr2) {
    if (arr1 == null && arr2 == null) return null;
    
    // new arr, assumes none are null
    int len1 = arr1.length; int len2 = arr2.length;
    if (len1 == 0) return arr2; if (len2 == 0) return arr1;

    int fullLen = arr1.length + arr2.length;
    int[] newArr = new int[fullLen];

    //pointers
    int p1 = 0;
    int p2 = 0;

    for (int i = 0; i < fullLen; i++) {
      if (p1 < len1 && (arr1[p1] <= arr2[p2] || p2 == len2)) {
          newArr[i] = arr1[p1]; p1++;
      }
      else {
        newArr[i] = arr2[p2]; p2++;
      }
    }
    return newArr;

  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(merge(new int[] {2,3,6}, new int[] {1,5,9})));
    System.out.println(Arrays.toString(merge2(new int[] {2,3,6}, new int[] {1,5,9})));

    System.out.println(Arrays.toString(merge(new int[] {}, new int[] {1,5,9})));
    System.out.println(Arrays.toString(merge2(new int[] {}, new int[] {})));

    int[] nullArr = null;
    System.out.println(Arrays.toString(merge(nullArr, new int[] {1,5,9})));
    System.out.println(Arrays.toString(merge2(nullArr, nullArr)));
  }
}