public class Test {
    public static void main(String[] args) {
        //Test program for BinaryTree (Task 5)
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.root = new BTNode(1);
        tree.root.right = new BTNode<>(3);
        tree.root.right.right = new BTNode<>(8);
        tree.root.left = new BTNode<>(2);
        tree.root.left.left = new BTNode(4);
        tree.root.left.right = new BTNode<>(5);
        tree.root.left.right.left = new BTNode<>(12);
        System.out.println("The number of one-child nodes in the tree is " + tree.numOneChildNodes());
        System.out.println("The root subtrees have equal number of nodes: " + tree.subtreesHaveEqualNumberOfNodes());
        System.out.println("The key 5 is in the tree : " + tree.search(5));
        System.out.println("Preorder Traversal is: ");
        tree.preorderTraversal();
        System.out.println(" Inorder Traversal is: ");
        tree.inorderTraversal();
        System.out.println(" Before deleting key 3,  level order traversal of binary tree is:");
        tree.levelOrderTraversal();
        System.out.println("The tree is: ");
        tree.printTree();
        System.out.println("After deleting key 3, level order traversal of binary tree is: ");
        tree.deleteByCopying(3);
        tree.levelOrderTraversal();
        System.out.println("The tree is: ");
        tree.printTree();
    }
}
