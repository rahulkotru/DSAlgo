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
    public static void main(String[] args) {
        int arr[]={5,1,9,2,10,15,20};
        linSearch(arr,2);
    }
}