
//stack using arrays

import java.util.EmptyStackException;
import java.util.Arrays;

public class StackA {

  private int[] stack;
  private int length;
  private int max;

//default length
  public StackA() {
    stack = new int[100];
    length = 0; max = 100;
  }

  public boolean isEmpty() {
    return (length  == 0);
  }

  public int peek() {
    if (isEmpty()) throw new EmptyStackException();
    System.out.println(stack[length - 1]); //can comment out
    return this.stack[length - 1];
  }

  public void push(int n) {
    if (length == stack.length) {
      stack = Arrays.copyOf(stack, max * 2);
    }
      stack[length] = n;
      length++;
  }
  

  public int pop() {
     if (isEmpty()) throw new EmptyStackException();
    int oldInd = length - 1;
    int oldVal = stack[oldInd];
    stack[oldInd] = 0;
    length--;
    return oldVal;
  }

  public void printStack() {
    for (int num : stack) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(5);
    s.push(2);
    s.push(4);
    s.printStack();
    s.peek();
    s.pop();
    s.pop();
    s.printStack();
   // s.pop(); s.pop(); //error
  }



}