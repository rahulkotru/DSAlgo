class rotateImage{
    class Solution{
        public void rotate(int [][] arr){
            int start=0;
            int end=arr[0].length;
            for(int i=0;i<arr.length;i++){
                for(j=0;j<arr[0].length;j++){
                    arr[i][j]=arr[j][i]
                }
            }
            for(int i=0;i<arr.length;i++){
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
            }
            print(arr);
        }
        public static void print(arr[][]){
            for(int i=0;i<arr.length;i++){
                for(j=0;j<arr[0].length;j++){
                    System.out.println(arr[i][j]+'');
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[][]={{1,2,3},{4,5,6}};
        System.out.println(arr[0].length);
    }
}