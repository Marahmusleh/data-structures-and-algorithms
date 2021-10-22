package trees.KaryTree;

public class FizzBuzzTree {

  public static Tree newTree = new Tree();

  public static Tree fizzBuzzTree(Tree tree){
    if(tree.getRoot() == null) return newTree;
    newTree.setRoot(new KTreeNode(checkValue(tree.getRoot().getValue())));
    fizzBuzzTree(tree.getRoot(), newTree.getRoot());
    return newTree;
  }

  public static void fizzBuzzTree(KTreeNode root,KTreeNode outputRoot){
    for (int i = 0; i < root.getChildren().size() ; i++){
      KTreeNode node = new KTreeNode( checkValue(root.getChildren().get(i).getValue()));
      outputRoot.getChildren().add(node);
      fizzBuzzTree(root.getChildren().get(i),outputRoot.getChildren().get(i));
    }
  }

  private static Object checkValue(Object val){
    return ((int)val) % 3 == 0 && ((int)val) % 5 == 0 ?  "FizzBuzz" : ((int)val) % 3 == 0 ? "Fizz" :  ((int)val) % 5 == 0 ? "Buzz": val.toString();
  }


}
