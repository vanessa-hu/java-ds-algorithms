import java.util.Arrays;

class MyArray {

  private int max;
  private int length;
  private Object[] arr;


  MyArray() {
    max = 1;
    length = 0;
    arr = new Object[1];

  }

  public Object get(int index) {
    return arr[index];
  }

  public void push(Object obj) {
    length++;
    if (max == length) {
      arr = Arrays.copyOf(arr, max * 2);
    }
    max *= 2;
    arr[length - 1] = obj;
  }


  public Object pop() {
    Object temp = arr[length - 1];
    arr[length - 1] = null;
    length--;
    return temp;
  }

  public Object delete(int index) {
    Object deleted = arr[index];
    shiftDown(index);
    return deleted;
  }

  public void shiftDown(int index) {

    for (int i = index; i < arr.length - 1; i++) {
      arr[i] = arr[i+1];
    }
    length--;
  }

   public static void main(String[] args) {
    MyArray m = new MyArray();
    m.push("Hello");
    m.push("World");

    for (int i = 0; i < m.length; i++) {
      System.out.println(m.get(i));
    }


}

}