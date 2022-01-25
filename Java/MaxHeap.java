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
    public int sink(int k){
        int max=heap[1];
        swap(1,n);
        n--;
        sink(1);
        heap[n+1]=null;
        if(n>0&&(n==(heap.length-1)/4)){
            resize(heap.length/2);
        }
        return max;
    }
    public void swap(int a,int b){
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
    public static void main(String[] args) {
        MaxHeap mp = new MaxHeap(3);
        mp.insert(5);
        mp.insert(6);
        System.out.println(mp.size());
        System.out.println(mp.isEmpty());

    }
}