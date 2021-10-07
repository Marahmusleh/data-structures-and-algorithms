package StackAndQueue;

public class Stack {

  private Node top;

  public void push(String data){
    Node node = new Node(data);
    if(isEmpty()){
      top=node;
    }else {
      node.setNext(top);
      top = node;
    }
  }
  public String pop() throws Exception {
    if (isEmpty()) {
      throw new Exception("Stack is Empty");
    } else {
      String value = top.getValue();
      top = top.getNext(); // assign the top to the next node so the first will be out
      return value;
    }
  }

  public String peek() throws Exception {
    if(isEmpty()){
      throw new Exception("Stack is Empty");
    }else {
      return top.getValue();
    }
  }

  boolean isEmpty() {
    return top==null;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    if (top==null) return "Stack is Empty";
    output.append("Stack{").append("\n");
    Node current = top;
    while (current.getNext() != null){
      output.append(current.getValue()).append("\n");
      current=current.getNext();
    }
    output.append(current.getValue()).append("\n").append(" }");
    return output.toString();
  }
}
