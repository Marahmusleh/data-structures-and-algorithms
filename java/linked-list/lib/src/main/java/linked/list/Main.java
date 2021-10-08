package linked.list;

import java.util.LinkedList;

public class Main {
  public static void main(String[] args) throws Exception {
    Linkedlist link = new Linkedlist();
    link.insert("b");
    link.insert("c");
    link.insert("a");

    System.out.println(link.toString());
    System.out.println(link.includes("d"));
    Linkedlist ll2 = new Linkedlist();

    ll2.append("marah");
    ll2.append("sara");
    ll2.append("mais");
    System.out.println(ll2.toString());
    ll2.insertAfter("marah","maisaa");
    System.out.println(ll2.toString());
    ll2.insertBefore("marah","aya");
    System.out.println(ll2.toString());
    System.out.println(ll2.kthFromEnd(3));


  }
}
