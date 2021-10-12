/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StackAndQueue;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

  @Test
  void pushOneNodeToStack() {
    Stack stack1 = new Stack();
    stack1.push("1");
    assertEquals("Stack{\n" +
      "1\n" +
      " }", stack1.toString());
  }

  @Test void canPushToStack(){
    Stack stack = new Stack();
    stack.push("1");
    stack.push("2");
    stack.push("3");
    String expected ="Stack{\n" +
      "3\n" +
      "2\n" +
      "1\n" +
      " }";
    assertEquals(expected, stack.toString());
  }

  @Test
  void popOfTheStack() {
    Stack stack1 = new Stack();
    stack1.push("1");
    stack1.push("2");
    stack1.push("3");
    stack1.pop();

    assertEquals("Stack{\n" +
      "2\n" +
      "1\n" +
      " }", stack1.toString());
  }

  @Test
  void popUntilEmptyStack() {
    Stack stack1 = new Stack();
    stack1.push("1");
    stack1.push("2");
    stack1.push("3");
    stack1.pop();
    stack1.pop();
    stack1.pop();
    assertEquals("Stack is Empty", stack1.toString());
  }

  @Test
  void peekNextItem() {
    Stack stack1 = new Stack();
    stack1.push("1");
    stack1.push("2");
    stack1.push("3");
    stack1.push("4");
    stack1.pop();
    assertEquals("3", stack1.peek());
  }

  @Test
  void testInstantiateEmptyStack() {
    Stack stack1 = new Stack();

    assertEquals("Stack is Empty", stack1.toString());
  }

  @Test
  void exceptionPeekOrPopEmptyStack(){
    Stack stack1 = new Stack();
    assertThrows(EmptyStackException.class, stack1::peek);
    assertThrows(EmptyStackException.class, stack1::pop);

  }

  @Test
  void canEnqueueOneNodeToQueue() {
    Queue<Animal> queue1 = new Queue<Animal>();
    queue1.enqueue("1");
    assertEquals("Queue{front -> 1 <- back }", queue1.toString());
  }

  @Test
  void canEnqueueMultiNodeToQueue() {
    Queue<Animal> queue1 = new Queue<Animal>();
    queue1.enqueue("1");
    queue1.enqueue("2");
    queue1.enqueue("3");
    assertEquals("Queue{front -> 1 -> 2 -> 3 <- back }", queue1.toString());
  }

  @Test
  void dequeueFromQueue() throws Exception {
    Queue<Animal> queue1 = new Queue<Animal>();
    queue1.enqueue("1");
    queue1.enqueue("2");
    queue1.enqueue("3");
    assertEquals("1", queue1.dequeue());
  }

  @Test
  void peekQueue(){
    Queue<Animal> queue1 = new Queue<Animal>();
    queue1.enqueue("1");
    queue1.enqueue("2");
    queue1.enqueue("3");
    assertEquals("1", queue1.peek());
  }

  @Test
  void emptyQueueAfterDequeue() throws Exception {
    Queue<Animal> queue1 = new Queue<Animal>();
    queue1.enqueue("1");
    queue1.enqueue("2");
    queue1.enqueue("3");
    queue1.dequeue();
    queue1.dequeue();
    queue1.dequeue();
    assertTrue(queue1.isEmpty());
  }

  @Test
  void testInstantiateEmptyQueue() {
    Queue<Animal> queue1 = new Queue<Animal>();

    assertEquals("Queue is Empty", queue1.toString());
  }

  @Test
  void testExceptionPeekOrDequeueEmptyQueue() {
    Queue<Animal> queue = new Queue<Animal>();

    assertThrows(EmptyStackException.class, queue::dequeue);
    assertThrows(EmptyStackException.class, queue::peek);
  }

  @Test
  void testingEnqueuePseudoQueue() {
    PseudoQueue pseudoQueue = new PseudoQueue();
    pseudoQueue.enqueue("10");
    pseudoQueue.enqueue("20");
    pseudoQueue.enqueue("30");
    pseudoQueue.enqueue("40");

    assertEquals("PseudoQueue[40]->[30]->[20]->[10]->NULL", pseudoQueue.toString());
  }

  @Test
  public void testDequeuePseudoQueue(){
    PseudoQueue pseudoQueue = new PseudoQueue();
    pseudoQueue.enqueue("20");
    pseudoQueue.enqueue("15");
    pseudoQueue.enqueue("10");
    pseudoQueue.enqueue("5");
    pseudoQueue.dequeue();


    assertEquals( "PseudoQueue[5]->[10]->[15]->NULL",pseudoQueue.toString());
  }

 @Test
 public void testEmptyInputStack(){
   PseudoQueue pseudoQueue = new PseudoQueue();
   assertEquals( "empty stack!",pseudoQueue.dequeue());

 }
  @Test void AnimalShelterEnqueueDequeue() throws Exception {
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
    // test enqueue
    assertEquals("AnimalShelter{dogs=Queue{front -> bella -> coco <- back }, cats=Queue{front -> lily -> brbr -> lucy <- back }}", animalShelter.toString());
    //test dequeue cat
    animalShelter.dequeue("cat");
    assertEquals("AnimalShelter{dogs=Queue{front -> bella -> coco <- back }, cats=Queue{front -> brbr -> lucy <- back }}", animalShelter.toString());
   //test dequeue god
    animalShelter.dequeue("dog");
    assertEquals("AnimalShelter{dogs=Queue{front -> coco <- back }, cats=Queue{front -> brbr -> lucy <- back }}", animalShelter.toString());

  }
}
