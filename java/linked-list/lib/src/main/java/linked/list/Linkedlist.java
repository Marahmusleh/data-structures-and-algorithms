package linked.list;

import java.util.LinkedList;
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

  public String kthFromEnd(int k) {
    Node current = head;
    Node prev = null, next = null;
    while (current != null) {
      next = current.next;
      current.setNext(prev);
      prev = current;
      current = next;
    }
    head = prev;
    if(size==1){
      System.out.println("Linked list has only one node!");
    } else if (k > size) {
      System.out.println("The number is greater than the length ");
    } else if (k == size) {
      System.out.println("Number and the length of the list are the same");
    } else if (k < 0) {
      System.out.println("It's not a positive number");}
    Node p = head;
    int count = 0;
    while (p != null) {
      if (count == k)
        return (p.getData());
      count++;
      p = p.getNext();
    }
    return "Enter a correct number";
  }
  public static Linkedlist zipLists(Linkedlist Link1, Linkedlist Link2) {
    Node l1 = Link1.head;
    Node l2 = Link2.head;
    Node current = null;

    if (l1 == null) {
      return Link2;
    }
    if (l2 == null){
      return Link1;
    }

    while (l1 != null && l2 != null) {
      if (l1 != null) {
        current = l1.next;
        l1.next = l2;
        l1 = current;
      }
      if (l2 != null) {
        current = l2.next;
        if (l1 != null)
          l2.next = l1;
        l2 = current;
      }

    }
    return Link1;
  }



}
