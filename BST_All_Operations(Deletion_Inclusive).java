package any;

import java.util.*;

class Node{
    int key;
    Node left,right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}
public class BFSQ {
    static Node root;

    void insert(int key)
    {
        root = insertRec(root, key);
    }
    Node insertRec(Node root, int key)
    {
        if (root == null)
        {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

   void del(int key){
       root=delRec(root,key);
   }
   Node delRec(Node root,int key){
       if(root==null) return root;
       if(key<root.key) root.left=delRec(root.left,key);
       else if(key>root.key) root.right=delRec(root.right,key);
       //for same root
       else {
           //for 1 and 0 child
           if(root.left==null) return root.right;
           else if(root.right==null) return root.left;
           //for 2 child
           root.key=min(root.right);
           root.right=delRec(root.right,root.key);
       }
       return root;
   }
   int min(Node root){
       int min=root.key;
       while(root.left!=null){
           min=root.left.key;
           root=root.left;
       }
       return min;
   }

    static void print()
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            Node tempNode = queue.poll();
            System.out.print(tempNode.key + " ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String args[]) {
        BFSQ tree= new BFSQ();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("traversal of the given tree");
        tree.print();

        System.out.println("\nDelete 20");
        tree.del(20);
        System.out.println("traversal of the modified tree");
        tree.print();

        System.out.println("\nDelete 30");
        tree.del(30);
        System.out.println("traversal of the modified tree");
        tree.print();

        System.out.println("\nDelete 50");
        tree.del(50);
        System.out.println("traversal of the modified tree");
        tree.print();
    }
}
