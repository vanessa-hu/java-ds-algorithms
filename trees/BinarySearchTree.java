//https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
//https://www.geeksforgeeks.org/iterative-searching-binary-search-tree/

class BinarySearchTree {

  class BSNode {
    int value;
    BSNode left;
    BSNode right;

    public BSNode(int val) {
      this.value = val;
      left = right = null;
    }

  }

  BSNode root;

  public BinarySearchTree(BSNode root) {
    this.root = root;
  }
  //recursive search

  public BSNode search(int key) {
    return search(this.root, key);
  }

  private BSNode search(BSNode head, int key) {
    if (head == null || head.value == key) return head;
    if (key < head.value) return search(head.left, key);
    return search(head.right, key);
  }
  
  //recursive insert
  public void insert(int value) {
    this.root = insertRec(this.root, value);

  }

  private BSNode insertRec(BSNode node, int key) {
    if (node == null) {
      node = new BSNode(key); return node;
    }
    if (key < node.value) {
      node.left = insertRec(node.left, key);
    }
    else if (key > node.value) {
      node.right = insertRec(node.right, key);
    }
    return node;
  }

  //https://www.geeksforgeeks.org/binary-search-tree-set-2-delete/
  public BSNode delete(int key) {
    this.root = deleteRec(this.root);
  }
  private BSNode deleteRec(BSNode node, int key) {
    // return if not there
    if (node == null) return node;
    // if key is less than current, reset left side to the deleted version of the right side. same with right side
    if (key < node.value) 
      node.left = deleteRec(node.left, key);
    else if (key < node.value)
      node.right = deleteRec(node.right, key);
    // if head is the key we need to remove:
    // if this subbranch just has one branch,  the entire one branch is the answer
    else {
      if (node.left == null) return node.right;
      if (node.right == null) return node.left;
    // if not, need to find the smallest node in the right branch, swap the head value with it, and delete the original node
      BSNode min = findMin(node.right);
      node.value = min.value;
      min = null; 
      // or deleteRec(node.right, min.value)

    }
    return node;
  }
  private BSNode findMin(BSNode node) {
    if (node == null) return null;
    if (node.left == null) return node;
    else return findMin(node.left);
  }



}