public class linearSearch{
    public static void linSearch(int[] arr,int n){
        for (int i =0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Element found at position"+n);
            }
            else{
                System.out.println("Element not found");
            }
        }
    }
    public static void BinSearch(int arr[],int n){
        int start=0;
        int end =arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==n){
                System.out.println("Found at"+mid);
            }
            if(n<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        linSearch(arr,2);
        BinSearch(arr,4);
    }
}