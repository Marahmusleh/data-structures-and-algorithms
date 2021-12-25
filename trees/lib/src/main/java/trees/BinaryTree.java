package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {
  public Node<T> root;
  public List<T> depthList = new ArrayList<>();


  public List<T> inOrder(Node<T> root) {
    try {
      if (root.getLeftNode() != null) {
        inOrder(root.getLeftNode());
      }
      depthList.add(root.getValue());
      if (root.getRightNode() != null) {
        inOrder(root.getRightNode());
      }
    } catch (Exception exception) {
      System.out.println("Unexpected Error");
    }
    return depthList;
  }

  public List<T> preOrder(Node<T> root) {
    try {
      depthList.add(root.getValue());
      if (root.getLeftNode() != null) {
        preOrder(root.getLeftNode());
      }
      if (root.getRightNode() != null) {
        preOrder(root.getRightNode());
      }
    } catch (Exception error) {
      System.out.println("Unexpected Error");
    }
    return depthList;
  }


  public List<T> postOrder(Node<T> root) {
    try {
      if (root.getLeftNode() != null) {
        postOrder(root.getLeftNode());
      }
      if (root.getRightNode() != null) {
        postOrder(root.getRightNode());
      }
      depthList.add(root.getValue());
    } catch (Exception exception) {
      System.out.println("Unexpected Error");
    }
    return depthList;
  }

  public Node<T> getRoot() {
    return root;
  }


  public int findMaxNumber(Node<Integer> root) {
    if (root == null) return 0;
    int max = root.getValue();
    int leftNode = findMaxNumber(root.getLeftNode());
    int rightNode = findMaxNumber(root.getRightNode());

    if (leftNode > max) max = leftNode;
    if (rightNode > max) max = rightNode;

    return max;
  }

//  public int FindMax(Node<T> root){
//    List<Integer> myList = (List<Integer>) preOrder();
//    int max = Integer.MIN_VALUE;
//    for (Integer integer : myList) {
//      if (integer > max) {
//        max = integer;
//      }
//    }
//    return max;
//  }

  public List<T> breadthFirst(BinarySearchTree<T> tree) throws Exception {
    List<T> breadthList = new ArrayList<>();
    Queue<Node> breadth = new Queue<>();
    breadth.enqueue(tree.getRoot());

    while (!breadth.isEmpty()) {
      Node front = breadth.dequeue();
      breadthList.add((T) front.getValue());

      if (front.getLeftNode() != null)
        breadth.enqueue(front.getLeftNode());
      if (front.getRightNode() != null)
        breadth.enqueue(front.getRightNode());
    }
    return breadthList;
  }

  //////////// sumRoot /////////
  int sum = 0;

  public int PreorderTraversal() {
    if (isEmpty()) {
      return 0;
    }
    sumRoots(root);
    return sum;
  }

  private void sumRoots(Node<T> root) {
    if (root.getLeftNode() == null && root.getRightNode() == null) {
      return;
    }
    sum = sum + (Integer) root.getValue();
    System.out.print(root.getValue() + " -> ");

    if (root.getLeftNode() != null) {
      sumRoots(root.getLeftNode());
    }

    if (root.getRightNode() != null) {
      sumRoots(root.getRightNode());
    }

  }
///////////////////////////////////////SYMMETRIC/////////////////////////////

  public boolean isSymmetric(Node<T> root) {

    return isMirror(root, root);
  }

  public boolean isMirror(Node<T> t1, Node<T> t2) {

    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;

    return (t1.getValue() == t2.getValue())
      && isMirror(t1.getRightNode(), t2.getLeftNode())
      && isMirror(t1.getLeftNode(), t2.getRightNode());
  }

//////////////////////////////////merge Tree//////////////////////////

  public Node<Integer> mergeTrees(Node<Integer> t1, Node<Integer> t2) {

    if (t1 == null)
      return t2;
    if (t2 == null)
      return t1;
    t1.value = t1.value + t2.value;
    t1.leftNode = mergeTrees(t1.getLeftNode(), t2.getLeftNode());
    t1.rightNode = mergeTrees(t1.getRightNode(), t2.getRightNode());


    return t1;
  }

  /////////////////////////////inverte Tree////////////////////////////
// 8- inverting Tree
  public Node<T> invertTree(Node<T> root) {
    if (root == null) {
      return root;
    }
    invertTree(root.leftNode);
    invertTree(root.rightNode);

    Node<T> t = root.getLeftNode();
    root.setLeftNode(root.getRightNode());
    root.setRightNode(t);

    return root;
  }

  ////////////////////////////////////////count all nodes /////////////////////////
  public int count(Node<T> root  ){

    if ( isEmpty())return 0;

    traverse(root);
    return sum ;
  }
  public void traverse(Node<T> root){
    if(root.getLeftNode() != null){
      traverse(root.getLeftNode());

    }
    System.out.print(root.value + " -> ");
    sum = sum +1;
    if(root.getRightNode() !=null) {
      traverse(root.getRightNode());

    }
  }

  ////////////////////////////////////////SECOND LARGEST ELEMENT////////BINARY TREE + BST///////////////
  public T secondLargest(Node<T> root){
    if(isEmpty()) return null;

    ArrayList<T> second = new ArrayList<>();
    traverse111(root, second);

    return  second.get(second.size()-2);

  }
  public void traverse111(Node<T> root, ArrayList<T> second){
    if (root == null) return;

    if(root.getLeftNode() != null){
      traverse111(root.getLeftNode(), second);
    }

    second.add(root.value);

    if(root.getRightNode() != null){
      traverse111(root.getRightNode(), second);
    }
  }

  public boolean hasPathSum(Node<Integer> node, int sum) {
    boolean ans = false;
    int subSum = sum - node.getValue();
    if(subSum == 0 && node.getLeftNode() == null && node.getRightNode() == null)
      return(ans = true);
    if(node.getLeftNode() != null)

      // ans || hasPathSum... has no utility if the ans is false
      ans = ans || hasPathSum(node.getLeftNode(), subSum);

    if(node.getRightNode() != null)
      // But if it is true then we can avoid calling hasPathSum
      // here as answer has already been found
      ans = ans || hasPathSum(node.getRightNode(), subSum);
    return(ans);
  }

  //==================================================================================================
  // 9- max Depth
  public int maxDepth(Node<T> root) {
    if (root == null)
      return 0;

    int leftDepth = maxDepth(root.getLeftNode());
    int rightDepth = maxDepth(root.getRightNode());

    if (leftDepth > rightDepth)
      return (leftDepth + 1);
    else
      return (rightDepth + 1);
  }

  //==============================================================================================

  // 7- identical Tree
  public boolean identicalTrees(Node<T> a, Node<T> b) {
    if (a == null && b == null)
      return true;

    if (a != null && b != null)
      return (a.getValue() == b.getValue()
        && identicalTrees(a.getLeftNode(), b.getLeftNode())
        && identicalTrees(a.getRightNode(), b.getRightNode()));

    return false;
  }


//================================================================================================

  // Sum of Root To Leaf Binary Numbers
  int treePathsSumUtil(Node<Integer> node, int val) {
    if (node == null)
      return 0;
    val = (val*10 + node.getValue());
    if (node.getLeftNode() == null && node.getRightNode() == null)
      return val;
    return treePathsSumUtil(node.getLeftNode(), val)
      + treePathsSumUtil(node.getRightNode(), val);
  }



  public boolean search(Node<T> root, T data) {
    if (root == null) {
      return false;
    } else if (root.getValue().compareTo(data) == 0) {
      return true;
    } else if (root.getValue().compareTo(data) > 0) {
      return search(root.getLeftNode(), data);
    }
    return search(root.getRightNode(), data);
  }

  //=======================================================================

  // 6- Count_BST_nodes_in_range

//    // Returns count of nodes in BST in
//    // range [low, high]
//    int getCount(BinaryNode node, int low, int high)
//    {
//        // Base Case
//        if(node == null)
//            return 0;
//
//        if(node.getData() >= low && node.getData() <= high)
//            return 1 + this.getCount(node.getLeftNode(), low, high)+
//                    this.getCount(node.getRightNode(), low, high);
//
//        else if(node.getData() < low)
//            return this.getCount(node.getRightNode(), low, high);
//        else
//            return this.getCount(node.getLeftNode(), low, high);
//    }

  // Returns count of nodes in BST in
  // range [low, high]


  //=======================================================================================
  // find the sec largest element on BST
//  public T findSecMax() throws Exception{
//    if(isEmpty()){throw new Exception("The tree is empty");}
//    else {
//      return findMax(root);
//    }
//  }

//  public BinarySearchTree<Integer> inorderTraversal() {
//    if (isEmpty()) {
//      return null;
//    }
//    BinarySearchTree<Integer> inorder = new BinarySearchTree<>();
//    traverseInorder(root,inorder);
//    return inorder;
//  }
//
//  private void traverseInorder(Node<T> root ,BinarySearchTree<Integer> inorder) {
//    if (root.leftNode != null) {
//      traverseInorder(root.leftNode,inorder);
//    }
////    System.out.print(root.getValue() + " -> ");
//    inorder.add(root.value);
//    if (root.rightNode != null) {
//      traverseInorder(root.rightNode);
//    }
//  }



  public void setRoot(Node<T> root) {
    this.root = root;
  }


  boolean isEmpty() {
    return root==null;
  }

//  private T findSecMax(Node<T> root){
//    if (root.getRightNode().getRightNode() != null){
//      return findMaxNumber(root.getRightNode());
//    }else return root.getValue();
//  }
  //===============================================================================================


//  public int sumOddValues(BinarySearchTree<T> bst){
//    if(root==null){
//      throw new IllegalArgumentException("Tree is empty");
//    }
//    int oddSum=0;
//    postOrder(bst.root);
//     List<T> depthList = new ArrayList<>();
//
//    for(int i=0; i< List.size(); i++){
//      if(List.get(i) %2 !=0){
//        oddSum = List.get(i) + oddSum;
//      }
//    }
//    return oddSum;
//  }
//
//      public int sumOfOdd(Node root) {
//        if (isEmpty()) {
//            return 0;
//        }
//        ArrayList<T> treeList = preOrder(root);
//        int sum = 0;
//
//        for (int i = 0; i < treeList.size(); i++) {
//            if (Integer.parseInt(treeList.get(i) + "") % 2 != 0) {
//                sum = sum + Integer.parseInt(treeList.get(i) + "");
//            }
//
//        }
//        return sum;
//    }
}



