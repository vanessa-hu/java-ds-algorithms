
//https://introcs.cs.princeton.edu/java/43stack/Stack.java.html
import java.util.EmptyStackException;

public class Stack {

  int length;
  Node top;

  class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  public Stack() {
    this.length = 0;
    this.top = null;
  }
  public boolean isEmpty() {
    return (top == null);
  }

  public int peek() {
    if (isEmpty()) throw new EmptyStackException();
    System.out.println(this.top.value); //can comment out
    return this.top.value;
  }

  public void push(int n) {
    Node newTop = new Node(n, this.top);
    this.top = newTop;
    length++;
  }

  public int pop() {
     if (isEmpty()) throw new EmptyStackException();

    int oldTopVal = this.top.value;
    this.top = this.top.next;
    length--;
    return oldTopVal;
  }

  public void printStack() {
    if (this.top == null) return;
    System.out.print(this.top.value);
    Node curr = this.top.next;
    while (curr != null) {
       System.out.print(" -> " + curr.value);
       curr = curr.next;     
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
  }




}