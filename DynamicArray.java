@SuppressWarnings("unchecked")
public class DynamicArray <T> implements Iterable<T> {

    private T [] arr;
    private int len = 0;
    private int capacity = 0;
    
    public DynamicArray() {this(16);}
    public DynamicArray(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        this.capacity = capacity;
        arr=(T[]) new Object[capacity];
    }
    public int size() {return len;}//size Method
    public boolean isEmpty() {return size()==0;}//isEmpty Method

    public T get(int index){return array[index];}//get Method
    public void set(int index, T elem) {arr[index]=elem;}//set Method
    public void clear(){//Clear Method
        for (int i=0;i<capacity;i++)
        arr[i]=null;
        len=0;
    }
    public void add(T elem){// Add Method
        if (len+1>=capacity){
            if (capacity==0) capacity=1;
            else capacity *=2;
            T[] new_arr= (T[])new Object[capacity];
            for (int i=0;i<len;i++)
            new_arr[i]=arr[i];
            arr=new_arr;
        }
        arr[len++]=elem;
    }
}