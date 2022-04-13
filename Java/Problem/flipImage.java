class flipImage{
    class Solution{
        public int [][] flip(int [][] arr){
            for(int i= 0;i<arr.length;i++){
                int start=0;
                int end=arr.length-1;
                while(start<=end){
                    if(arr[i]==arr[i][end]){
                        arr[i][start]=1-arr[i][start];
                        arr[i][end]=1-arr[i][start];
                    }
                    start++;
                    end--;
                }
            }
        }
    }
    public static void main(String[] args){
        
    }
}
