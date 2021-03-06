class peakIndexMountain{
    class Solution{
        public static int peakIndex(int[] A){
            int left=0;
            int right=A.length-1;

            while(left<right){
                int midPoint=left-(right-left)/2;
                if(A[midPoint]<A[midPoint+1]){
                    left=midPoint+1;
                }
                else{
                    right=midPoint;
                }
            }
            return left;
        }
    }
    public static void main(String args[]){

    }
}