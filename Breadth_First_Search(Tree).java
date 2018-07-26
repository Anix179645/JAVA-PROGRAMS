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
    Node root;

    void print(){
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node tempNode=queue.poll();
            System.out.println(tempNode.key+" ");

            if(tempNode.left!=null) queue.add(tempNode.left);
            if(tempNode.right!=null) queue.add(tempNode.right);
        }
    }
    public static void main(String args[]) {
        BFSQ tree_level= new BFSQ();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.print();
    }
}
