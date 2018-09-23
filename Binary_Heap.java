package hp1;
public class Main {
    int[] harr;
    int capacity;
    int heap_size;
    int parent(int i) { return (i-1)/2; }
    int left(int i) { return (2*i + 1); }
    int right(int i) { return (2*i + 2); }
    int getMin() { return harr[0]; }
    Main(int cap)
        {
        heap_size = 0;
        capacity = cap;
        harr = new int[cap];
        }

        void insert(int v)
        {
        if (heap_size == capacity)
        {
            System.out.println("Overflow: Could not insertKey");
            return;
        }
        heap_size++;
        int i = heap_size - 1;
        harr[i] = v;
        while (i != 0 && harr[parent(i)] > harr[i])
        {
            harr[parent(i)]=swap(harr[i],harr[i]= harr[parent(i)]);
        i = parent(i);
        }
        }
        void decreaseKey(int i, int new_val)
        {
        harr[i] = new_val;
        while (i != 0 && harr[parent(i)] > harr[i])
        {
            harr[parent(i)]=swap(harr[i],harr[i]= harr[parent(i)]);
        i = parent(i);
        }
        }

        int extractMin()
        {
        if (heap_size <= 0)
        return Integer.MAX_VALUE;
        if (heap_size == 1)
        {
        heap_size--;
        return harr[0];
        }
        int root = harr[0];
        harr[0] = harr[heap_size-1];
        heap_size--;
        MinHeapify(0);

        return root;
        }
        void delete(int k)
        {
        decreaseKey(k, Integer.MIN_VALUE);
        extractMin();
        }
        void MinHeapify(int i)
        {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && harr[l] < harr[i])
        smallest = l;
        if (r < heap_size && harr[r] < harr[smallest])
        smallest = r;
        if (smallest != i)
        {
            harr[smallest]=swap(harr[i],harr[i]= harr[smallest]);
        MinHeapify(smallest);
        }
        }
        int swap(int x, int y)
        {
        return x;
        }
    public static void main(String[] args) {
        Main h=new Main(11);
        h.insert(3);
        h.insert(2);
        h.delete(1);
        h.insert(15);
        h.insert(5);
        h.insert(4);
        h.insert(45);
        System.out.println( h.extractMin()+" ");
        System.out.println(h.getMin()+" ");
        h.decreaseKey(2, 1);
        System.out.println(h.getMin());
    }
}
