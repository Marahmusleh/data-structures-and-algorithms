package trees;

import java.util.EmptyStackException;

public class Queue<T> {
  private NodeQueue<T> front;
  private NodeQueue<T> back;

  public void enqueue(T value){
    NodeQueue<T> node = new NodeQueue<T>(value);
    if(isEmpty()){
      front =node;
      back = node;
    }else{
      back.setNext(node);
      back =node;
    }
  }
  public T dequeue() throws Exception {
    if(isEmpty()){
      throw new EmptyStackException();
    }else{
      T value =  front.getValue();
      front = front.getNext();
      return value;
    }
  }
  public T peek()  {
    if (isEmpty()) {
      throw new EmptyStackException();
    } else {
      return  front.getValue();
    }
  }

  boolean isEmpty() {
    return front == null;
  }
}

