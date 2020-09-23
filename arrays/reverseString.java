
public reverseString {


  public static String reverse(String str) {
    // O(n)
    // check input
    if (str == null) return "";
    String reversed = "";
    int max = str.length - 1;
    for (int i = max; i > -1; i--) {
      reversed += str[i];
    }

  }

  public static String reverse2(String str) {
    
  }
}