class containsDuplicate{
    class Solution{
        public boolean containDuplicate(int [] nums){
            HashSet<Integer> numbers=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(numbers.contains(nums[i])){
                    return true;
                }
                numbers.add(nums[i]);
            }
            return false;
        }
    }
    public void main(String [] args]){

    }
}