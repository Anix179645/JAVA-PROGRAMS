//This method assumes that there is no duplicates
//Use hash set as they don't accept duplicate elements..if duplicates are entered it doesn't count or retain that
package any;

import java.util.*;

public class unionninter {
    static LinkedList<Integer> l1=new LinkedList<Integer>();
    static LinkedList<Integer> l2=new LinkedList<Integer>();
    static void inter(int m){
        for(int i=0;i<m;i++){
            if(l2.contains(l1.get(i))) System.out.print(l1.get(i)+" ");
        }
    }
    static void union(int m,int n){
        for(int i=0;i<m;i++) {
            if (!l2.contains(l1.get(i))) System.out.print(l1.get(i) + " ");
        }
        for(int i=0;i<n;i++) System.out.print(l2.get(i)+" ");
    }
    public static void main(String args[])
    {
        //ll1
        l1.add(5);
        l1.add(3);
        l1.add(5);
        l1.add(2);
        l1.add(1);
        //ll2
        l2.add(4);
        l2.add(5);
        l2.add(2);
        l2.add(7);
        l2.add(8);
        int m=l1.size();
        int n=l2.size();
        System.out.println("Intersection is: ");
        inter(m);
        System.out.println();
        System.out.println("Union is: ");
        union(m,n);
    }
}
