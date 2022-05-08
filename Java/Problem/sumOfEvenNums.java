class sumOfEvenNums{
    class Solution{
        public int[] sumEven(int[] A, int [][] queries){
            int [] results=new int[A.length];
            int currentSum=0;
            while(counter<results.length){
                for(int i=0;i<A.length;i++){
                    if(A[i]%2==0){
                        currentSum+=A[i];
                    }
                }
            }
        }
    }
    public static void main(String args[]){

    }
}