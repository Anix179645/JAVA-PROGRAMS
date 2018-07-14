package querev;

import java.util.*;

public class querev {
   static Queue<Integer> q=new LinkedList<Integer>();
   static void revers(){
       int x=q.remove();
       int y=q.peek();
       if(q.size()!=1) revers();
       else{
           q.remove();
           q.add(y);
       }
       q.add(x);
   }
    public static void main(String[] args) {
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Normal queue: "+q);
        revers();
        System.out.println("Reverse queue: "+q);
    }
}
