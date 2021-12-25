/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import trees.KaryTree.FizzBuzzTree;
import trees.KaryTree.KTreeNode;
import trees.KaryTree.Tree;

import java.util.ArrayList;

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
//    System.out.println(binarySearchTree);
//    System.out.println(binarySearchTree.postOrder(binarySearchTree.getRoot()));
//    System.out.println(binarySearchTree.preOrder(binarySearchTree.getRoot()));
//    System.out.println(binarySearchTree.inOrder(binarySearchTree.getRoot()));
//    System.out.println(binarySearchTree.contains(70));
//    System.out.println(binarySearchTree.findMaxNumber(binarySearchTree.getRoot()));

    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(9);
    tree.add(8);
    tree.add(7);
    tree.add(6);
    tree.add(5);
    tree.add(4);
    tree.add(3);
    tree.add(2);
    tree.add(1);
    tree.add(0);


    tree.breadthFirst(tree);
//    System.out.println(tree.hasPathSum(tree.root,95));
//    System.out.println(tree.treePathsSumUtil(tree.root,0));

//        BinaryTree<Character> newTree = new BinaryTree<Character>();
//        Node<Character> root = new Node('A');
//        Node<Character> node2 = new Node('B');
//        Node<Character> node3 = new Node('D');
//        Node<Character> node5 = new Node('E');
//        newTree.setRoot(root);
//        newTree.getRoot().setLeftNode(node2) ;
//        newTree.getRoot().setRightNode(node2);
//        newTree.getRoot().getLeftNode().setLeftNode(node3);
//    newTree.getRoot().getLeftNode().setRightNode(node3);
//    newTree.getRoot().getRightNode().setLeftNode(node5);
//    newTree.getRoot().getRightNode().setRightNode(node5);
//
//    System.out.println(newTree.isSymmetric(root));

  }
  }

