package trees.KaryTree;


public class Tree <T>{
 private KTreeNode root;

  public Tree(T value) {
    this.root = new KTreeNode(value);
  }

  public Tree() {
  }

  public KTreeNode getRoot() {
    return root;
  }

  public void setRoot(KTreeNode root) {
    this.root = root;
  }

  @Override
  public String toString() {
    return "Tree{" +
      "root=" + root +
      '}';
  }

}
