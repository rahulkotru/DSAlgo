class arrayTranspose{
    class Solution{
        public static int [][] transpose(int [][] arr){
            int row= arr.length();
            int col=arr[0].length();
            for (int i=0;i<row;i++){
                for(j=i;j<row;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                }
            }
        }
    }
    public static void main(String[] args){

    }
}