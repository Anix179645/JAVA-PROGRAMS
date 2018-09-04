import java.util.*;
class tre {
    public static void main(String[] args) {
        TreeSet<Integer> tr=new TreeSet<>();
        tr.add(8);
        tr.add(9);
        tr.add(3);
        tr.add(2);
        tr.add(5);
        tr.add(4);
        tr.add(8);
        tr.add(1);
        Iterator<Integer> itr=tr.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
