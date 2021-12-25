package trees;

public  class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
  public Node<T> root;

  public void add(T data) {
    if (root==null) { // tree empty
      root = new Node<>(data);
    } else {
      add(data, root);
    }
  }

  private void add(T data, Node<T> root) {
    Node<T> binaryNode = new Node<>(data);
    if(data.compareTo(root.getValue()) == 0) System.out.println("No duplicate nodes");
    if (data.compareTo(root.getValue()) < 0) { //< 0 if the data is lexicographically less than the data of root
      if (root.getLeftNode() == null) { //if its less check if the left of root not null then insert
        root.setLeftNode(binaryNode);
      } else {
        add(data, root.getLeftNode());//if there is a left then call the func. with new left root
      }
    } else if(data.compareTo(root.getValue()) > 0) {
      if (root.getRightNode() == null) {
        root.setRightNode(binaryNode);
      } else {
        add(data, root.getRightNode());
      }
    }
  }
  private boolean contains(Node<T> root, T value) {
    if ( root == null) {
      return false;
    }
    if (value == root.getValue()) {
      return true;
    }
    T current = root.getValue();
    return value.compareTo(current) < 0 //if the value less than the current value Implement the first statement
      ? contains(root.getLeftNode(), value)
      : contains(root.getRightNode(), value);
  }

  public boolean Contains(T data) {
    while (root != null) {
      if (root.getValue().compareTo(data) == 0) return true;
      if (root.getValue().compareTo(data) > 0) root = root.leftNode;
      else root = root.rightNode;
    }
    return false;
  }

  public boolean contains2(T data) {
    Node<T> binaryTreeNode1 = root;

    if(isEmpty()) return false;
    while (binaryTreeNode1 != null) {
      if (data.compareTo(binaryTreeNode1.getValue()) > 0)
        binaryTreeNode1 = binaryTreeNode1.getRightNode();
      else if (data.compareTo(binaryTreeNode1.getValue()) < 0)
        binaryTreeNode1 = binaryTreeNode1.getLeftNode();
      else
        return true;
    }
    return false;
  }

  public Node<T> getRoot() {
    return root;
  }


}
