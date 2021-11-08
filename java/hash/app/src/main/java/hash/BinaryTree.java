package hash;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {


  public TreeNode<T> root;


  private List<T> treeList = new ArrayList<>();

  public List<T> inOrder(TreeNode<T> root) {

    if (root.left != null) inOrder(root.left);

    treeList.add(root.value);

    if (root.right != null) inOrder(root.right);

    return treeList;
  }
}
