package trees;

public class NodeQueue<T> {
  private T value;
  private NodeQueue<T> next;


  public NodeQueue(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public NodeQueue<T> getNext() {
    return next;
  }

  public void setNext(NodeQueue<T> next) {
    this.next = next;
  }
}
