
//https://introcs.cs.princeton.edu/java/43stack/

//https://introcs.cs.princeton.edu/java/43stack/Queue.java.html
//implemented w linked list
import java.util.NoSuchElementException;
//https://introcs.cs.princeton.edu/java/43stack/
public class Queue {

  int length;
  Node front;
  Node back;

  class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
      this.next = null;
    }
    
    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  public Queue() {
    this.length = 0;
    this.front = null; this.back = null;
  }
  public boolean isEmpty() {
    return (length == 0);
  }
//  --> enq
  public void enqueue(int n) {
    Node oldBack = this.back;
    this.back = new Node(n);
    if (isEmpty()) {
      this.front = this.back;
    }
    else {
      oldBack.next = this.back;
    }
    length++;
  }

  public int dequeue() {
    if (isEmpty()) throw new NoSuchElementException("empty queue");
    int oldVal = this.front.value;
    this.front = this.front.next;
    length--;
    return oldVal;
  }

  public int peek() {
    if (isEmpty()) throw new NoSuchElementException("empty queue");
    System.out.println(this.front.value);
    return this.front.value;
  }

  public void printQueue() {
    Node curr = this.front;
    while (curr != null) {
      System.out.print(curr.value + " ");
      curr = curr.next;
    }
    System.out.println();
    // if (this.front == null) return;
    // System.out.print(this.front.value);
    // Node curr = this.front.next;
    // while (curr != null) {
    //    System.out.print(" - " + curr.value);
    //    curr = curr.next;     
    // }
    // System.out.println();
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.printQueue();
    q.dequeue();
    q.peek();
    q.printQueue();
    q.dequeue(); q.printQueue();
   q.dequeue(); q.printQueue(); //empty
    //q.dequeue(); //throws exception


    
  }


}