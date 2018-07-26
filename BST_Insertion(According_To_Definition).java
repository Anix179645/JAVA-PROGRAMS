package any;

//Binary Search Tree, is a node-based binary tree data structure which has the following properties:
//
//The left subtree of a node contains only nodes with keys lesser than the node’s key.
//The right subtree of a node contains only nodes with keys greater than the node’s key.
//The left and right subtree each must also be a binary search tree.
//There must be no duplicate nodes.

class Node{
    int key;
    Node left,right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}
public class BST {
     Node root;

    void insert(int key){
        root=insertRec(root,key);
    }
    Node insertRec(Node root,int key){
        if(root==null) {root=new Node(key);return root;}
        if(key<root.key) root.left=insertRec(root.left,key);
        if(key>root.key) root.right=insertRec(root.right,key);
        return root;
    }

    void printInorder(Node node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.println(node.key + " ");
        printInorder(node.right);
    }

    void printInorder()  {
        printInorder(root);
    }

    public static void main(String args[]) {
        BST tree= new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.printInorder();
    }
}
