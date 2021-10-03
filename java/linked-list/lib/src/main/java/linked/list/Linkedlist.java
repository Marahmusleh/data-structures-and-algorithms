package linked.list;

public class Linkedlist {

  Node head;
  private int size;

  public void insert(String value) {
    Node newNode = new Node(value);
    if (head != null)
      newNode.setNext(head);
    head = newNode;
  }

@Override
  public String toString() {
  String result="";
    if (head == null) {
       result = new String("List is empty");
    } else {
      Node current;
      current = head;

      while (current != null) {
        result += "{ " + current.getData() + " } -> ";
        current = current.next;

      }

      result += ("NULL");
    }
  return result;

}
  public boolean includes(String data) {
    Node current = head;
    while (current!=null) {
      if (data.equals(current.getData())) {
        return true;
      }
      current = current.getNext();
    }
    return false;

  }

  }
