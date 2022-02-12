public class mergeSort{
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public void sort(int [] arr,int [] temp, int low, int high){
        if(low<high){
            int mid=low+(high-low)/2;
            sort(arr,temp,low,high);
            sort(arr,temp,low:mid+1,high);
            merge(arr,temp,low,mid,high);
        }
    }
    private void merge(int[] arr,int)
    public static void main(String[] args) {
        int [] arr=new int[]{9,5,2,4,3};
        mergeSort ms=new mergeSort();
        printArray(arr);
    }
}