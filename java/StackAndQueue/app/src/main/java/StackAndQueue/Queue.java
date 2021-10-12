package StackAndQueue;

import java.util.EmptyStackException;

public class Queue<D extends Animal> {
  private Node front;
  private Node back;

  public void enqueue(String value){
    Node node = new Node(value);
    if(isEmpty()){
      front =node;
      back = node;
    }else{
      back.setNext(node);
      back =node;
    }
  }
  public String dequeue() throws Exception {
    if(isEmpty()){
      throw new EmptyStackException();
    }else{
      String value = front.getValue();
      front = front.getNext();
      return value;
    }
  }
  public String peek()  {
    if (isEmpty()) {
      throw new EmptyStackException();
    } else {
      return front.getValue();
    }
  }

  boolean isEmpty() {
    return front == null;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    if (front==null) return "Queue is Empty";
    output.append("Queue{").append("front -> ");
    Node current = front;
    while (current.getNext() != null){
      output.append(current.getValue()).append(" -> ");
      current=current.getNext();
    }
    output.append(current.getValue()).append(" <- back }");
    return output.toString();
  }
}
