
//https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/

public class MyLinkedList {

  private int length;
  private Node head; 

  class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
      next = null;
    }
  }

  public MyLinkedList() {
    length = 0;
    head = null;
  }

  public MyLinkedList prepend(int value) {
    length++;
    Node newHead = new Node(value);
    newHead.next = this.head;
    this.head = newHead;
    return this;
  }

  public MyLinkedList append(int value) {
    Node end = new Node(value);
    if (this.head == null) this.head = end;
    else {
      Node curr = this.head;
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = end;
    }
    length++;
    return this;
  }

  public MyLinkedList insert(int index, int value) {
  
    if (index == 0) return prepend(value);
    // if index not in list?
    if (index >= this.length) {
      return append(value);
      //return this;
    }
    // Node prev = this.head;
    // for (int i = 0; i < index - 1; i++) {
    //   prev = prev.next;
    // }
    Node prev = traverseToInd(index - 1);

    Node newNode = new Node(value);
    newNode.next = prev.next;
    prev.next = newNode;
    length++;
    return this;
  }

 public void remove(int index) {
   if (this.head == null || index >= this.length || index < 0) return;
   length--;
    if(index == 0) {
      this.head = this.head.next;
      return;
    }
   Node prev = traverseToInd(index - 1);
   prev.next = prev.next.next;

 }
 public Node traverseToInd(int index) {
   if (index >= this.length || index < 0) return null;
   Node indNode = this.head;
    for (int i = 0; i < index; i++) {
      indNode = indNode.next;
    }
    return indNode;
        // 0 1 2
 }

  public void printList() {
    if (head == null) return;
    System.out.print(this.head.value);
    Node tail = this.head.next;
    while (tail != null) {
      System.out.print(" -> " + tail.value);
      tail = tail.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    MyLinkedList mySinglyLinkedList = new MyLinkedList();
    mySinglyLinkedList.prepend(5);
    mySinglyLinkedList.append(8);
    mySinglyLinkedList.append(4);
    mySinglyLinkedList.prepend(10);
    mySinglyLinkedList.printList();
    mySinglyLinkedList.insert(2,15);
    mySinglyLinkedList.printList();
    mySinglyLinkedList.remove(100);
    mySinglyLinkedList.remove(3);
    mySinglyLinkedList.printList();
    // mySinglyLinkedList.reverse();
    // mySinglyLinkedList.printList();
  }






}