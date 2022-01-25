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
    public void resize(int capacity){
        Integer [] temp= new Integer[capacity];
        for(int i=0;i<heap.length;i++){
            temp[i]=heap[i];
        }
        heap=temp;

    }
    public void insert(int x){
        if(n==heap.length-1){
            resize(2*heap.length);
        }
        n++;
        heap[n]=x;
        swim(n);
    }
    private void swim(int k){
        while(k>1&&heap[k/2]<heap[k]){
            int temp=heap[k];
            heap[k]=heap[k/2];
            heap[k/2]=temp;
            k=k/2;
        }
    }
    public static void main(String[] args) {
        MaxHeap mp = new MaxHeap(3);
        System.out.println(mp.size());
        System.out.println(mp.isEmpty());

    }
}