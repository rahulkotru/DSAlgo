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
    private static void merge(int[] arr,int[] temp,int low,int high){
        for (int i=low;i<=high;i++){
            temp[i]=arr[i];
        }
        int i =low;
        int j=mid+1;
        int k=low;
        while(i<=mid&&j<=high){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }
            else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k]=temp[i];
            k++;
            i++;
        }
    }
    public static void main(String[] args) {
        int [] arr=new int[]{9,5,2,4,3};
        printArray(arr);
        sort(arr,new int[arr.length],low:0,high:arr.length-1);
        printArray(arr);
    }
}