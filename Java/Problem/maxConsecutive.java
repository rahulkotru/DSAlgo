class maxConsecutive{
    class Solution{
        public int longestOnes(int A[], int k){
            int i=0;
            int j=0;
            while(i<A.length){
                if(A[i]==0) K--;
                if(K<0){
                    if(A[j]==0){
                        K++;
                    }
                    j++;
                }
                i++;
            }
            return i-j;
        }
    }
    public static void main(String[] args){

    }
}