package sam1;
class SegmentTree{
    int st[];
    SegmentTree(int[] a,int n){
        int x=(int)Math.ceil(Math.log(n)/Math.log(2));
        int size=2*(int)Math.pow(2,x)-1;
        st=new int[size];
        construct(a,0,n-1,0);
    }
    int getMid(int s,int e){
        return s+(e-s)/2;
    }
    int construct(int[] a,int s,int e,int i){
        if(s==e){
            st[i]=a[s];
            return st[i];
        }
        int mid=getMid(s,e);
        st[i]=construct(a,s,mid,i*2+1)+construct(a,mid+1,e,i*2+2);
        return st[i];
    }
    int getSum(int cs,int ce,int s,int e,int i){
        if (s <= cs && e >= ce)
            return st[i];
        if (ce < s || cs > e)
            return 0;
        int mid = getMid(cs, ce);
        return getSum(cs, mid, s, e, 2 * i + 1) + getSum(mid + 1, ce, s, e, 2 * i + 2);
    }
    int getSum(int n,int s,int e){
        if(s<0||e>n-1||s>e){
            System.out.println("Invalid Input");
            return -1;
        }
        return getSum(0,n-1,s,e,0);
    }
    void update(int s,int e,int i,int diff,int ci){
        if (i < s || i > e)
            return;
        st[ci] = st[ci] + diff;
        if (e != s) {
            int mid = getMid(s,e);
            update(s, mid, i, diff, 2 * ci + 1);
            update(mid + 1, e, i, diff, 2 * ci + 2);
        }
    }
    void update(int[] a,int n,int i,int new_val){
        if (i < 0 || i > n - 1) {
            System.out.println("Invalid Input");
            return;
        }
        int diff = new_val - a[i];
        a[i] = new_val;
        update(0, n - 1, i, diff, 0);
    }
}
class test3 {
    public static void main(String[] args) {
        int a[]={1,3,5,7,9,11};
        int n=a.length;
        SegmentTree tree=new SegmentTree(a,n);
        System.out.println("Sum of values in given range = " +
                tree.getSum(n, 1, 3));
        tree.update(a, n, 1, 10);
        System.out.println("Updated sum of values in given range = " +
                tree.getSum(n, 1, 3));
    }
}
