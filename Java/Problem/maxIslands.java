class maxIslands{
    class Solution{
        public int findConsecutiveMax(int [] nums){
            int max=0;
            int currentMax=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==1){
                    currentMax+=1;
                    max=Math.max(max,currentMax);
                    
                }
                else{
                    currentMax=0;
                }
            }
            return max;
        }
    }
    public static void main(String[] args){

    }
}