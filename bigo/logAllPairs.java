import java.util.Arrays;

class logAllPairs {
  public static void main(String[] args) {
    int[] arr = {3,4,5};
    log(arr);

  }

  public static void log(int[] nums) {
    int len = nums.length;
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        System.out.println("Pair: " + nums[i] + " " + nums[j]);
      }
    }
  }
}