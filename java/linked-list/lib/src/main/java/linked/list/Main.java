package linked.list;

public class Main {
  public static void main(String[] args) {
    Linkedlist link = new Linkedlist();
    link.insert("a");
    link.insert("b");
    link.insert("c");

    System.out.println(link.toString());
    System.out.println(link.includes("d"));
  }
}