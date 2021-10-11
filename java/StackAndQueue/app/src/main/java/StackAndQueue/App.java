package StackAndQueue;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello");
    Stack stack = new Stack();

    stack.push("1");
    stack.push("2");
    stack.push("3");
    System.out.println(stack.toString());
    System.out.println(stack.peek());
//    System.out.println(stack.pop());
    System.out.println(stack.isEmpty());

    Queue queue = new Queue();

    queue.enqueue("1");
    queue.enqueue("2");
    queue.enqueue("3");
    System.out.println(queue.toString());
    System.out.println(queue.peek());
//    System.out.println(queue.dequeue());
    System.out.println(queue.isEmpty());


//
    PseudoQueue pseudoQueue=new PseudoQueue();
    pseudoQueue.enqueue("20");
    pseudoQueue.enqueue("15");
    pseudoQueue.enqueue("10");
    pseudoQueue.enqueue("5");
    System.out.println(pseudoQueue);
    System.out.println(pseudoQueue.dequeue());
    System.out.println(pseudoQueue);


  }


}
