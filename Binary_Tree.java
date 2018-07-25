package any;
class Node{
    int key;
    Node left,right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}
    class binary_tree {
    Node root;
      binary_tree(int key){
        root=new Node(key);
        }
        binary_tree(){
          root=null;
        }
    public static void main(String args[]) {
        binary_tree ob=new binary_tree();
        ob.root=new Node(1);
        ob.root.left=new Node(2);
        ob.root.right=new Node(3);
        ob.root.left.left=new Node(4);
        ob.root.right.right=new Node(5);
    }
}
