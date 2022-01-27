import java.util.*;
public class linearSearch{
    public static void linSearch(int[] arr,int n){
        Arrays.sort(arr);
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
        Arrays.sort(arr);
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
    public static int searchInsertPosition(int num[],int numb){
        Arrays.sort(num);
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(num[mid]==numb) {
                return mid;
            }
            if(numb<num[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void bubbleSort(int arr[]){
        boolean isSwapped=true;
        for(int i=0;i<arr.length-1;i++){
            isSwapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }

        }
        System.out.println("Swapping complete: "+ isSwapped);
    }
    static void insertionSort(int arr[]){
        int n=arr.length;

        for (int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,3,2,8,1,0};
        linSearch(arr,2);
        BinSearch(arr,7);
        int y=searchInsertPosition(arr,8);
        System.out.println(y);
    }
}