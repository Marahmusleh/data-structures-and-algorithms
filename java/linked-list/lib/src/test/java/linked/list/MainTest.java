package linked.list;

//import linked.list.Linkedlist;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  //CodeChallenge05 Testing methods:
  @Test
  void instantiateLinkedList() {
    Linkedlist MyTest = new Linkedlist();
    assertNull(MyTest.head);
  }

  @Test
  void canInsert() {
    Linkedlist MyTest = new Linkedlist();
    MyTest.insert("c");
    MyTest.insert("b");
    MyTest.insert("a");
    String expected = "{ a } -> { b } -> { c } -> NULL";
    assertEquals(expected, MyTest.toString());
  }

  @Test
  void headPointsRight() {
    Linkedlist MyTest = new Linkedlist();
    MyTest.insert("c");
    MyTest.insert("b");
    MyTest.insert("a");
    assertEquals("a", MyTest.head.getData());
  }

  @Test
  void canInsertMultiple() {
    Linkedlist MyTest = new Linkedlist();
    MyTest.insert("d");
    MyTest.insert("c");
    MyTest.insert("b");
    MyTest.insert("a");
    String expected = "{ a } -> { b } -> { c } -> { d } -> NULL";
    assertEquals(expected, MyTest.toString());
  }

  @Test
  void LinkedListIncludes() {
    Linkedlist ll = new Linkedlist();
   ll.insert("a");
   ll.insert("b");
   ll.insert("c");
    assertTrue(ll.includes("b"));
  }

  @Test
  void LinkedListDoesntIncludes() {
    Linkedlist ll = new Linkedlist();
      ll.insert("a");
      ll.insert("b");
      ll.insert("c");

    assertFalse(ll.includes("g"));
    assertFalse(ll.includes("i"));
  }

  @Test
  void includesWorkingFine() {
    Linkedlist ll = new Linkedlist();
     ll.insert("c");
     ll.insert("b");
     ll.insert("a");

    String expected = "{ a } -> { b } -> { c } -> NULL";
    assertEquals(expected, ll.toString());
  }
}
