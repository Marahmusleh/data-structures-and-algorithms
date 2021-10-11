package StackAndQueue;

public class PseudoQueue {
  private Stack inputStack ;
  private Stack outputStack ;

  public PseudoQueue() {
    this.inputStack = new Stack();
    this.outputStack = new Stack();
  }

  public void enqueue(String num){
    inputStack.push(num);
  }
  public String dequeue(){
    if(inputStack.isEmpty()) return "empty stack!";
    if(outputStack.isEmpty())
      while(!inputStack.isEmpty()){
        outputStack.push(inputStack.peek());
        inputStack.pop();
  }
    String temp = outputStack.pop();
    while (!outputStack.isEmpty()){
      inputStack.push(outputStack.pop());
    }
    return temp;

}

  @Override
  public String toString() {
      StringBuilder result = new StringBuilder("PseudoQueue");
      Node current = inputStack.top;
      while (current != null){
        result.append("[").append(current.getValue()).append("]->");
        current = current.getNext();
      }
      result.append("NULL");
      return result.toString();
  }
}
