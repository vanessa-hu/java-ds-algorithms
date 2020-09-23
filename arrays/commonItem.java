import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;
// Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
//For Example:
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'i'];
//should return false.
//-----------
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'x'];
//should return true.

// 2 parameters - arrays - no size limit
// return true or false

// INPUT: 2 arrays, n m // Object
// OUTPUT: boolean

class commonItem {
  // brute force
  // memory O(1)
  // time :( O(nm) n^2
  public static boolean common(Object[] arr1, Object[] arr2) {

    for (Object el1 : arr1) {
      for (Object el2 : arr2 ) {
        if (el1.equals(el2)) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean common2(Object[] arr1, Object[] arr2) {
    //optional: compare lengths to store smaller
    // time O(n + m)
    // with asList, maybe just m?
    // EDGE CASES / EXCEPTIONS
    // 
    //Set<Object> arr1Set = new HashSet<Object>(Arrays.asList(arr1));
    HashSet<Object> arr1Set = new HashSet<>();
    for (Object obj1 : arr1) {
      arr1Set.add(obj1);
    }
    for (Object obj2 : arr2) {
      if (arr1Set.contains(obj2)) {
        return true;
      }
    }
    return false;
    
  }
  //cleaner; from https://github.com/nimrod46/Data-Structures-and-Algorithms/blob/master/src/interview_question/CommonItems.java
    public static boolean containsCommonItemsBetterAndCleaner(Object[] array1, Object[] array2) {
    HashSet<Object> mapOfFirstArray = new HashSet<>(Arrays.asList(array1));
    return Stream.of(array2).anyMatch(mapOfFirstArray::contains);
  }

}