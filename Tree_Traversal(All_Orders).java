package any;

class Node{
    int key;
    Node left,right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}
public class treetraversal {
    static Node root;

    void printInorder(Node node){
        if(node==null) return;
        printInorder(node.left);
        System.out.println(node.key+" ");
        printInorder(node.right);
        }
    void printPreorder(Node node){
        if(node==null) return;
        System.out.println(node.key+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void printPostorder(Node node){
        if(node==null) return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.println(node.key+" ");
    }


    public static void main(String args[]) {
        treetraversal tree_level= new treetraversal();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree_level.printPreorder(root);

        System.out.println("\nInorder traversal of binary tree is ");
        tree_level.printInorder(root);

        System.out.println("\nPostorder traversal of binary tree is ");
        tree_level.printPostorder(root);
    }
}
