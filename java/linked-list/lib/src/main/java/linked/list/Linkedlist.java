package linked.list;

import java.util.Objects;

public class Linkedlist {

  Node head;
  private int size;

  public void insert(String value) {
    Node newNode = new Node(value);
    if (head != null)
      newNode.setNext(head);
    head = newNode;
  }

  public void append(String value) {
    if(head == null){
      head = new Node(value);
      size++;
    }else{
      Node current = head;
      while(current.next != null){//keep looping between nodes if the next is not null
        current=current.getNext();//walking between nodes cuz the next is not null
      }
      Node node = new Node(value);//when we reach to null create a node to add the value we need
      current.setNext(node);
      size++;
    }
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
  public void insertAfter(String value, String newValue){
    Node current = head;
    Node node = new Node(newValue);
    size++;

    while(current != null){
      if (current.getData() == value){
        node.next = current.next;
        current.next = node;
      }
      current = current.next;
    }
  }

  public void insertBefore(String value, String newValue){
    Node counter = head;
    Node node = new Node(newValue);
    size++;

    while(counter.next != null){
      if(head.getData() == value){
        node.next = head;
        head = node;
        return;
      }
      if(counter.next.getData() == value){
        node.next = counter.next;
        counter.next = node;
        return;
      }
      counter = counter.next;
    }
  }



  }
