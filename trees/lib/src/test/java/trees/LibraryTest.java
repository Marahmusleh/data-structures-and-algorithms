/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
  @Test
  void testEmptyTree() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    assertNull(tree.getRoot());
  }

  @Test
  void testTreeWithSingleRoot() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(2);
    assertEquals(2, tree.getRoot().getValue());
  }

  @Test
  void testTreeWithChildParent() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(10);
    tree.add(5);
    tree.add(30);
    assertEquals(10, tree.getRoot().getValue());
    assertEquals(5, tree.getRoot().getLeftNode().getValue());
    assertEquals(30, tree.getRoot().getRightNode().getValue());
  }

  @Test
  void testTreePreOrder() {
    BinarySearchTree<Integer> searchTree = new BinarySearchTree<>();
    searchTree.add(50);
    searchTree.add(10);
    searchTree.add(60);
    searchTree.add(5);
    searchTree.add(20);
    searchTree.add(55);
    searchTree.add(70);
    List list = Arrays.asList(50, 10, 5, 20, 60, 55, 70);
    assertEquals(list, searchTree.preOrder(searchTree.getRoot()));
  }

  @Test
  void testTreeInOrder() {
    BinarySearchTree<Integer> searchTree = new BinarySearchTree<>();
    searchTree.add(50);
    searchTree.add(10);
    searchTree.add(60);
    searchTree.add(5);
    searchTree.add(20);
    searchTree.add(55);
    searchTree.add(70);
    List list = Arrays.asList(5, 10, 20, 50, 55, 60, 70);
    assertEquals(list, searchTree.inOrder(searchTree.getRoot()));
  }

  @Test
  void testTreePostOrder() {
    BinarySearchTree<Integer> searchTree = new BinarySearchTree<>();
    searchTree.add(50);
    searchTree.add(10);
    searchTree.add(60);
    searchTree.add(5);
    searchTree.add(20);
    searchTree.add(55);
    searchTree.add(70);
    List list = Arrays.asList(5, 20, 10, 55, 70, 60, 50);
    assertEquals(list, searchTree.postOrder(searchTree.getRoot()));
  }

  //challenge 16

  @Test
  void maximumInTree() {

      BinarySearchTree<Integer> bst = new BinarySearchTree<>();
      bst.add(10);
      bst.add(5);
      bst.add(20);
      bst.add(50);
      bst.add(1);

      assertEquals(50, bst.findMaxNumber(bst.getRoot()));

    }
    @Test
  void maxInEmptyTree() {
      BinarySearchTree<Integer> bst = new BinarySearchTree<>();
      assertEquals(0,bst.findMaxNumber(bst.getRoot()));

    }

  }

