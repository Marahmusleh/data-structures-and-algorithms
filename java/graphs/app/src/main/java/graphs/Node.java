package graphs;

public class Vertex<T> {
  T value;
  Node next;
  public Node(T value){
    this.value = value;
  }
}
