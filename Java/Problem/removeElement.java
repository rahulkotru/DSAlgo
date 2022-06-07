class removeElement{
    class Solution{
        public int remove(int [] nums, int val){
            if(nums.length==0) return 0;
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[validSize]=nums[i];
                    validSize++;

                }
            }
            return validSize;
        }
    }
    public static void main(String[] args){

    }
}