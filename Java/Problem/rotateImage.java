class rotateImage{
    public static class Solution{
        
    }
    public static void rotate(int [][] arr){
        int start=0;
        int end=arr[0].length-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            int temp=arr[i][start];
            arr[i][start]=arr[i][end];
            arr[i][end]=temp;
        }
        print(arr);
    }
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        //System.out.println(arr.length);
        //System.out.println(arr[0].length);
        rotate(arr);
        //System.out.println(arr[0].length);
    }
}