class minSizeSubArray{
    class Solution{
        public int minSize(int a, int[] nums){
            int left=0;
            int result=Integer.MAX_VALUE;
            int valSum=0;
            for(int i=0;i<nums.length;i++){
                valSum+=nums[i];

                while(valSum>=s){
                    result=Math.min(result,i+1-left);
                }
            }
        }
    }
    public static void main(String args[]){

    }
}