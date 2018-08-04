package hp1;

import java.util.*;

class BinaryHeap{
    int heapsize;
    int[] heap;

    BinaryHeap(int capacity){
        heapsize=0;
        heap=new int[capacity];
        Arrays.fill(heap,-1);
    }
    int parent(int i){
        return ((i-1)/2);
    }
    int kthchild(int i,int k){
        return ((2*i)+k);
    }
    boolean isEmpty(){
        return heapsize==0;
    }
    boolean isFull(){
        return heapsize==heap.length;
    }
    public int deleteMin()
    {
        int keyItem = heap[0];
        delete(0);
        return keyItem;
    }
    public void makeEmpty( )
    {
        heapsize = 0;
    }
    void insert(int x){
        if(isFull()) throw new NoSuchElementException("Overflow Exception");
        heap[heapsize++]=x;
        heapifyUp(heapsize-1);
    }
    void heapifyUp(int childInd){
        int tmp=heap[childInd];
        while(childInd>0&&tmp<heap[parent(childInd)]){
            heap[childInd]=heap[parent(childInd)];
            childInd=parent(childInd);
        }
        heap[childInd]=tmp;
    }
    int delete(int ind){
        if(isEmpty()) throw new NoSuchElementException("Underflow Exception");
        int keyitem=heap[ind];
        heap[ind]=heap[heapsize-1];
        heapsize--;
        heapifyDown(ind);
        return keyitem;
    }
    void heapifyDown(int ind){
        int child;
        int tmp=heap[ind];
        while(kthchild(ind,1)<heapsize){
            child=minchild(ind);
            if(tmp>heap[child]) {heap[ind]=heap[child];heap[child]=tmp;}
            else break;
            ind=child;
        }
        heapifyUp(ind);
    }
    int minchild(int ind){
       int minchild=kthchild(ind,1);
       int rightchild=kthchild(ind,2);
       if(heap[rightchild]<heap[minchild]) minchild=rightchild;
       return minchild;
    }
    public void printHeap()
    {
        System.out.print("\nHeap = ");
        for (int i = 0; i < heapsize; i++)
            System.out.print(heap[i] +" ");
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*****Binary Heap Test*****\n");
        System.out.println("Enter size of Binary heap ");
        BinaryHeap bh = new BinaryHeap(scan.nextInt() );
        char ch;
        do
        {
            System.out.println("*****Binary Heap Operations*****");
            System.out.println("1. insert ");
            System.out.println("2. delete ");
            System.out.println("3. delete min");
            System.out.println("4. check full");
            System.out.println("5. check empty");
            System.out.println("6. clear");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    try
                    {
                        System.out.println("Enter integer element to insert");
                        bh.insert( scan.nextInt() );
                        bh.printHeap();
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage() );
                    }
                    break;
                case 2 :
                    try {
                        System.out.println("Enter integer index to delete ");
                        System.out.println("Integer "+bh.delete(scan.nextInt())+" is deleted");
                        bh.printHeap();
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage() );
                    }
                    break;
                case 3 :
                    try
                    {
                        System.out.println("Min Element : "+ bh.deleteMin());
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage() );
                    }
                    break;
                case 4 :
                    System.out.println("Full status = "+ bh.isFull());
                    break;
                case 5 :
                    System.out.println("Empty status = "+ bh.isEmpty());
                    break;
                case 6 :
                    bh.makeEmpty();
                    System.out.println("Heap Cleared\n");
                    bh.printHeap();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            System.out.println("Do you want to continue (Type y or n)");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
