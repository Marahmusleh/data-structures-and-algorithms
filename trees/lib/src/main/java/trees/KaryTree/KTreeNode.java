package trees.KaryTree;

import java.util.ArrayList;

public class KTreeNode {
  private ArrayList<KTreeNode> children = new ArrayList<>();
  private Object value;

  public KTreeNode(Object value) {
    this.value = value;
  }
  public KTreeNode(Object value,ArrayList children) {
    this.value = value;
    this.children = children;
  }
  public KTreeNode() {
  }

  public ArrayList<KTreeNode> getChildren() {
    return children;
  }

  public void setChildren(ArrayList<KTreeNode> children) {
    this.children = children;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "KTreeNode{" +
      "children=" + children +
      ", value=" + value +
      '}';
  }
}

