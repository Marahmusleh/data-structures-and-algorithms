package trees;

public  class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
  private Node<T> root;

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
  public boolean contains(T value) {
    return contains(root, value);
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

  public Node<T> getRoot() {
    return root;
  }


}
