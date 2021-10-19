/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class Library {
  public static void main(String[] args) throws Exception {
    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(50);
    binarySearchTree.add(10);
    binarySearchTree.add(60);
    binarySearchTree.add(5);
    binarySearchTree.add(20);
    binarySearchTree.add(55);
    binarySearchTree.add(70);
    System.out.println(binarySearchTree);
//    System.out.println(binarySearchTree.postOrder(binarySearchTree.getRoot()));
//    System.out.println(binarySearchTree.preOrder(binarySearchTree.getRoot()));
    System.out.println(binarySearchTree.inOrder(binarySearchTree.getRoot()));
    System.out.println(binarySearchTree.contains(70));
    System.out.println(binarySearchTree.findMaxNumber(binarySearchTree.getRoot()));

    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(20);
    tree.add(10);
    tree.add(30);
    tree.add(5);
    tree.add(15);
    tree.add(40);
    tree.add(25);

    System.out.println(tree.breadthFirst(tree));
  }
  }

