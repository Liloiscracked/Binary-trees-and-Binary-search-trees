public class BSTDriver
{
	public static void main(String[] args) {
		BST<String> tree = new BST<String>();
      String[] array = {"D", "B", "A", "C", "F", "H", "G", "J"};
      for(int k = 0; k < array.length; k++)
		  tree.insert(array[k]);
      
    try{
	  System.out.println("Path from root to node G is: " + tree.getPathToLeafNode("G"));
    }
    catch(IllegalArgumentException e){
      System.out.println(e);
    }
      System.out.println("\nThe BST is: ");
      tree.printTree();
      
      System.out.print("\nPreorder traversal: ");
      tree.preorderTraversal();
      System.out.print("\nInorder traversal: ");
      tree.inorderTraversal();
      System.out.print("\nPostorder traversal: ");
      tree.postorderTraversal();
      
      System.out.print("\nLevel order traversal: ");
      tree.levelOrderTraversal();
      
      
      
       System.out.println("\nLevel order traversal by levels: ");
      tree.levelOrderTraversalByLevels();

        try {
            System.out.println("The level of node G is: " + tree.getNodeLevel("G"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Tree after deleting node D by copying: ");
      tree.deleteByCopying("D");
       tree.printTree();
		//Likewise test all other methods.
   }
}
