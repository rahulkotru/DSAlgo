class sortParity{
    class Solution{
        public int[] sortPair(int []A){
            int [] newArr=new int[A.length];
            int counter=0;
            for (int i=0;i<A.length;i++){
                if(A[i]%2==0){
                    newArr[counter]=A[i];
                    counter++;
                }
            }
            for(int j=0;i<A.length;j++){
                if(A[i]%2==1){
                    newArr[counter]=A[j];
                    counter++;
                }
            }
            return newArr;
        }
    }
    public static void main(String[] args){

    }
}