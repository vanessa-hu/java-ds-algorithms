
//https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/

public class MyDoublyLinkedList {

  private int length;
  private DoublyNode head; 

  class DoublyNode {
    int value;
    DoublyNode next;
    DoublyNode prev;

    DoublyNode(int value) {
      this.value = value;
      this.next = null;
      this.prev = null;
    }
  }

  public MyDoublyLinkedList() {
    length = 0;
    head = null;
  }

  public MyDoublyLinkedList prepend(int value) {
    length++;
    DoublyNode newHead = new DoublyNode(value);
    newHead.next = this.head;
    if (this.head != null) this.head.prev = newHead;
    this.head = newHead;

    return this;
  }

  public MyDoublyLinkedList append(int value) {
    DoublyNode end = new DoublyNode(value);
    if (this.head == null) this.head = end;
    else {
      // 4 3 1 2
      DoublyNode curr = this.head;
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = end;
      end.prev = curr;
    }
    length++;
    return this;
  }

  public MyDoublyLinkedList insert(int index, int value) {
  // 4 2 1 5 7
  //
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
    DoublyNode prevNode = traverseToInd(index - 1);
    DoublyNode followNode = prevNode.next;

    DoublyNode newNode = new DoublyNode(value);
    newNode.next = followNode;
    //maybe not needed if part:
    if (followNode != null) followNode.prev = newNode;

    prevNode.next = newNode;
    newNode.prev = prevNode;
    length++;
    return this;
  }

 public void remove(int index) {
   if (this.head == null || index >= this.length || index < 0) return;
   length--;
    if(index == 0) {
      this.head = this.head.next;
      if (this.head != null) this.head.prev = null;
      return;
    }
   DoublyNode prevNode = traverseToInd(index - 1);
   prevNode.next = prevNode.next.next;
   if (prevNode.next != null) prevNode.next.prev = prevNode;

 }
 public DoublyNode traverseToInd(int index) {
   if (index >= this.length || index < 0) return null;
   DoublyNode indNode = this.head;
    for (int i = 0; i < index; i++) {
      indNode = indNode.next;
    }
    return indNode;
        // 0 1 2
 }

  public void printList() {
    if (head == null) return;
    System.out.print(this.head.value);
    DoublyNode tail = this.head.next;
    while (tail != null) {
      System.out.print(" <-> " + tail.value);
      tail = tail.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    MyDoublyLinkedList myList = new MyDoublyLinkedList();
    myList.prepend(5);
    myList.append(8);
    myList.append(4);
    myList.prepend(10);
    myList.printList();
    myList.insert(2,15);
    myList.printList();
    myList.remove(100);
    myList.remove(3);
    myList.printList();
    // mySinglyLinkedList.reverse();
    // mySinglyLinkedList.printList();
  }






}