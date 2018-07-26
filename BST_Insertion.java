package any;

import java.util.LinkedList;
import java.util.Queue;
public class BST_Insertion {

    static class Node {
        int key;
        Node left, right;

        Node(int key){
            this.key = key;
            left = null;
            right = null;
        }
    }
    static Node root;
    static void inorder(Node root)
    {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);
    }
    static void insert(Node temp1, int key)
    {
        if (temp1 == null) {
            temp1 = new Node(key);
            root = temp1;
            return;


        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp1);

        while (!q.isEmpty()) {
           Node temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
        }
    }
    public static void main(String args[])
    {
        System.out.print( "Inorder traversal before insertion:");
        inorder(root);
        insert(root, 12);
        insert(root, 1);
        insert(root, 4);
        insert(root, 6);
        System.out.print("\nInorder traversal after insertion:");
        inorder(root);
    }
}
