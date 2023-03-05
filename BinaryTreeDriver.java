public class BinaryTreeDriver{     
    public static void main(String args[])  { 
       // To be completed by students
            BST<Integer> tree = new BST<>();
            tree.insert(14);
            tree.insert(1);
            tree.insert(30);
            tree.insert(0);
            tree.printTree();
            System.out.println(tree.getPathToLeafNode(0));

    } 
} 