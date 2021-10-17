package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
  private Node<T> root;
  private List<T> depthList = new ArrayList<>();


  public List<T> inOrder(Node<T> root){
    try {
    if(root.getLeftNode() != null ){
      inOrder(root.getLeftNode());
    }
    depthList.add(root.getValue());
    if (root.getRightNode() != null){
      inOrder(root.getRightNode());
    }}catch (Exception exception){
      System.out.println("Unexpected Error");
    }
    return depthList;
  }
  public List<T> preOrder(Node<T> root){
    try {
      depthList.add(root.getValue());
      if (root.getLeftNode() != null) {
        preOrder(root.getLeftNode());
      }
      if (root.getRightNode() != null) {
        preOrder(root.getRightNode());
      }}catch(Exception error){
        System.out.println("Unexpected Error");
      }
      return depthList;
    }
  public List<T> postOrder(Node<T> root){
    try {
    if (root.getLeftNode() != null){
      postOrder(root.getLeftNode());
    }
    if(root.getRightNode() != null){
      postOrder(root.getRightNode());
    }
    depthList.add(root.getValue());
  }catch(Exception exception){
    System.out.println("Unexpected Error");
  }
      return depthList;
}

  public Node<T> getRoot() {
    return root;
  }


  public int findMaxNumber(Node<Integer> root) {
      if(root == null) return 0;
      int max = root.getValue();
      int leftNode = findMaxNumber(root.getLeftNode());
      int rightNode = findMaxNumber(root.getRightNode());

      if (leftNode > max) max = leftNode;
      if (rightNode > max) max = rightNode;

    return max;
  }


}

