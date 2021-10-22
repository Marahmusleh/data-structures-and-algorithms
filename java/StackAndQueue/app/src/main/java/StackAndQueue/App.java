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

    Queue<Animal> queue = new Queue<Animal>();

    queue.enqueue("1");
    queue.enqueue("2");
    queue.enqueue("3");
    System.out.println(queue.toString());
    System.out.println(queue.peek());
//    System.out.println(queue.dequeue());
    System.out.println(queue.isEmpty());


//
    PseudoQueue pseudoQueue = new PseudoQueue();
    pseudoQueue.enqueue("20");
    pseudoQueue.enqueue("15");
    pseudoQueue.enqueue("10");
    pseudoQueue.enqueue("5");
    System.out.println(pseudoQueue);
    System.out.println(pseudoQueue.dequeue());
    System.out.println(pseudoQueue);

    AnimalShelter animalShelter = new AnimalShelter();
    Cat cat1 = new Cat("lily");
    Cat cat2 = new Cat("lucy");
    Cat cat3 = new Cat("brbr");
    Dog dog1 = new Dog("coco");
    Dog dog2 = new Dog("bella");

    animalShelter.enqueue(cat1);
    animalShelter.enqueue(dog2);
    animalShelter.enqueue(cat3);
    animalShelter.enqueue(cat2);
    animalShelter.enqueue(dog1);

    System.out.println(animalShelter);

    animalShelter.dequeue("cat");
    System.out.println(animalShelter);

    animalShelter.dequeue("dog");
    System.out.println(animalShelter);



    Balanced balanced = new Balanced();

    System.out.println(balanced.validateBrackets("{)[]{]"));
    System.out.println(balanced.validateBrackets("(){}[[]]"));
    System.out.println(balanced.validateBrackets("()[[Extra Characters]]"));
    System.out.println(balanced.validateBrackets("{}(){}"));
    System.out.println(balanced.validateBrackets("{}"));
    System.out.println(balanced.validateBrackets("{}{Code}[Fellows](())"));
    System.out.println(balanced.validateBrackets("[({}]"));
    System.out.println(balanced.validateBrackets("(]("));
    System.out.println(balanced.validateBrackets("{(})"));




  }
}
