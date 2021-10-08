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

  //--------------------------------challenge6----------

  @Test
  void addOneToTheEnd() {
    Linkedlist mylist = new Linkedlist();

    mylist.append("tala");

    Node current = mylist.head;
    String actual = "";
    while (current != null) {
      actual += "{ " + current.getData() + " } -> ";
      current = current.next;
    }
    actual += "NULL";

    String expected = "{ tala } -> NULL";

    assertEquals(expected, actual);
  }

  @Test
  void addMultipleToTheEnd() {
    Linkedlist ll = new Linkedlist();
    Node n1 = new Node("end");
    Node n2 = new Node("anything");
    ll.head = n1;
    n1.next = n2;

    ll.append("one");
    ll.append("two");
    ll.append("three");

    Node current = ll.head;
    String actual = "";
    while (current != null) {
      actual += "{ " + current.getData() + " } -> ";
      current = current.next;
    }
    actual += "NULL";

    String expected = "{ end } -> { anything } -> { one } -> { two } -> { three } -> NULL";

    assertEquals(expected, actual);
  }

  @Test
  void addBeforeMiddle() {
    Linkedlist ll = new Linkedlist();
    Node n1 = new Node("1");
    Node n2 = new Node("2");
    Node n3 = new Node("3");
    Node n4 = new Node("4");

    ll.head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;

    ll.insertBefore("3", "10");

    Node current = ll.head;
    String actual = "";
    while (current != null) {
      actual += "{ " + current.getData() + " } -> ";
      current = current.next;
    }
    actual += "NULL";

    String expected = "{ 1 } -> { 2 } -> { 10 } -> { 3 } -> { 4 } -> NULL";

    assertEquals(expected, actual);
  }

  @Test
    //This tests if it can add one node or multiple nodes at the end of the linked list:
  void addBeforeFirst() {
    Linkedlist ll = new Linkedlist();
    Node n1 = new Node("1");
    Node n2 = new Node("2");
    Node n3 = new Node("3");
    Node n4 = new Node("4");
    ll.head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;

    ll.insertBefore("1", "10");

    Node current = ll.head;
    String actual = "";
    while (current != null) {
      actual += "{ " + current.getData() + " } -> ";
      current = current.next;
    }
    actual += "NULL";

    String expected = "{ 10 } -> { 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL";

    assertEquals(expected, actual);

  }

  @Test
  void addAfterMiddle() {
    Linkedlist ll = new Linkedlist();
    Node n1 = new Node("1");
    Node n2 = new Node("2");
    Node n3 = new Node("3");
    Node n4 = new Node("4");

    ll.head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;

    ll.insertAfter("2", "10");

    Node current = ll.head;
    String actual = "";
    while (current != null) {
      actual += "{ " + current.getData() + " } -> ";
      current = current.next;
    }
    actual += "NULL";

    String expected = "{ 1 } -> { 2 } -> { 10 } -> { 3 } -> { 4 } -> NULL";

    assertEquals(expected, actual);
  }

  @Test
  void addAfterLast() {
    Linkedlist ll = new Linkedlist();
    Node n1 = new Node("1");
    Node n2 = new Node("2");
    Node n3 = new Node("3");
    Node n4 = new Node("4");

    ll.head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;

    ll.insertAfter("4", "10");

    Node current = ll.head;
    String actual = "";
    while (current != null) {
      actual += "{ " + current.getData() + " } -> ";
      current = current.next;
    }
    actual += "NULL";

    String expected = "{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 10 } -> NULL";

    assertEquals(expected, actual);
  }

  @Test
  void kInTheMiddle() {
    Linkedlist ll = new Linkedlist();
    ll.append("10");
    ll.append("11");
    ll.append("12");
    ll.append("13");

    String actual = "11";
    try {
      actual = ll.kthFromEnd(2);
    } catch (Exception e) {
      e.printStackTrace();

    }
    ;
    assertEquals("11", actual);
  }

  @Test
  void testForOneNodeKth() {
    Linkedlist ll = new Linkedlist();
    ll.append("10");

    String actual = "Enter a correct number";
    actual = ll.kthFromEnd(2);
    assertEquals("Enter a correct number", actual);

  }

  @Test
  void testWhenKthHigh() {
    Linkedlist ll = new Linkedlist();
    ll.append("10");
    ll.append("11");
    ll.append("12");
    ll.append("13");


    String actual = "Enter a correct number";
    actual = ll.kthFromEnd(5);
    assertEquals("Enter a correct number", actual);

  }
  @Test
  void testWhenKthNegative() {
    Linkedlist ll = new Linkedlist();
    ll.append("10");
    ll.append("11");
    ll.append("12");
    ll.append("13");


    String actual = "Enter a correct number";
    actual = ll.kthFromEnd(-2);
    assertEquals("Enter a correct number", actual);

  } @Test
  void testWhenKthSametoSize() {
    Linkedlist ll = new Linkedlist();
    ll.append("10");
    ll.append("11");
    ll.append("12");
    ll.append("13");


    String actual = "Enter a correct number";
    actual = ll.kthFromEnd(4);
    assertEquals("Enter a correct number", actual);

  }
}
