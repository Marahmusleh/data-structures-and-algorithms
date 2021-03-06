package linked.list;

public class Node {
  private String data; // to store the data of node
  public Node next; // to store the address of the next node

  public Node(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return data;
  }
}
