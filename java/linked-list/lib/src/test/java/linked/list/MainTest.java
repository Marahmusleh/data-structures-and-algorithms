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
    MyTest.insert("a");
    MyTest.insert("b");
    MyTest.insert("c");
    String expected = "{ a } -> { b } -> { c } -> NULL";
    assertEquals(expected, MyTest.toString());
  }

  @Test
  void headPointsRight() {
    Linkedlist MyTest = new Linkedlist();
    MyTest.insert("a");
    MyTest.insert("b");
    MyTest.insert("c");
    assertEquals("a", MyTest.head.getData());
  }

  @Test
  void canInsertMultiple() {
    Linkedlist MyTest = new Linkedlist();
    MyTest.insert("a");
    MyTest.insert("b");
    MyTest.insert("c");
    MyTest.insert("d");
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
     ll.insert("a");
     ll.insert("b");
     ll.insert("c");

    String expected = "{ a } -> { b } -> { c } -> NULL";
    assertEquals(expected, ll.toString());
  }
}
