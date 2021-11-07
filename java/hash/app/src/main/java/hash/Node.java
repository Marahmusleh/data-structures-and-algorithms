package hash;

public class Node {
  public Object key;
  public Object value;
  public Node next;

  public Node() {
  }

  public Node(Object key, Object value) {
    this.key = key;
    this.value = value;
  }
}
