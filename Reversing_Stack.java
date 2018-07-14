package stackrev;
import java.util.*;
public class stkrev{
    static Stack<Integer> stk=new Stack<Integer>();

    static void revers(Stack<Integer> stk){
        int y=stk.pop();
        if(stk.size()!=1) revers(stk);
        insertrev(y);
    }
    static void insertrev(int y){
        int m=stk.pop();
        if(stk.size()!=0) insertrev(y);
        else stk.push(y);
        stk.push(m);

    }
    public static void main(String[] args) {

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        System.out.println(stk.peek());
        System.out.println("Normal Stack: "+stk);
        revers(stk);
        System.out.println("Reversed stack: "+stk);
    }
}
