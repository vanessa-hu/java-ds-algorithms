import java.util.*;

class HMap {

  private static class NodeList extends ArrayList<MyNode> {

  }

  private final int len;
  private NodeList[] map;


  public HMap(int len) {
    this.len = len;
    this.map = new NodeList[len];
  }

  private int hash(String key) {
    int hash = 0;
    for (int i = 0; i < key.length(); i++) {
      hash = (hash + key.charAt(i) * i) % len;
    }
    return hash;
  }

  public boolean set(String key, int value) {
    int hash = hash(key);
    if (this.map[hash] == null) {
      this.map[hash] = new NodeList();
    }
    return this.map[hash].add(new MyNode(key, value));
  }

  public int get(String key) {
    int hash = hash(key);
    NodeList bucket = this.map[hash];
    if (bucket != null) {
      for (int i = 0; i < bucket.size(); i++) {
        MyNode curr = bucket.get(i);
        if (curr.getKey().equals(key)) {
          return curr.getValue();
        }
      }
    }
    return 0;

  }

  public List<String> keys() {
    List<String> keys = new ArrayList<String>();
    for (int i = 0; i < len; i++) {
      NodeList bucket = map[i];
      if (bucket != null) {
        for (MyNode node: bucket) {
          keys.add(node.getKey());
        }
      }
    }
    return keys;

  }

    public static void main(String[] args) {
    HMap table = new HMap(50);
    table.set("ta", 1000);
    table.set("tu", 589);
    table.set("e", 10);
    System.out.println(table.keys().size());
    System.out.println(table.get("ta"));
    System.out.println(table.get("tu"));
    System.out.println(table.get("e"));
  }




}