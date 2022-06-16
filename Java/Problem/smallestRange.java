class smallestRange{
    class Solution {
        public int smallest(int [] A, int K){
            int minVal=A[i];
            int maxVal=A[i];
            for(int i=0;i<A.length;i++){
                minVal=Math.min(minVal,A[i]);
                maxVal=Math.max(maxVal,A[i]);
            }
            if(minVal+K >=maxVal-k){
                return 0;
            }
            else{
                return(maxVal-K)-(minVal+K);
            }
        }
    }
    public static void main(String[] args){

    }
}