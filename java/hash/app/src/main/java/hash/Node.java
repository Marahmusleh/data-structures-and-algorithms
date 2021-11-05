package hash;

public class Node {
  public int key;
  public Object value;
  public Node next;

  public Node() {
  }

  public Node(int key, Object value) {
    this.key = key;
    this.value = value;
  }
}
