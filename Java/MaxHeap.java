public class MaxHeap{
    Integer[] heap;
    int n;
    public MaxHeap(int capacity){
        heap=new Integer[capacity+1];
        n=0;
    }
    public boolean isEmpty(){
        return n==0;
    }    
    public int size(){
        return n;
    }
    public static void main(String[] args) {
        MaxHeap mp = new MaxHeap(3);
        System.out.println(mp.size());
        System.out.println(mp.isEmpty());

    }
}