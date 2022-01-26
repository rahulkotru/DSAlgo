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
    public static int searchInsertPosition(int num[],int num){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==num) {
                return mid;
            }
            if(num<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,3,2,8,1,0};
        linSearch(arr,2);
        BinSearch(arr,7);
    }
}