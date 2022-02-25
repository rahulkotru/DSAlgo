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
        pubblic boolean containDuplicateUsingArraySort(int num[]){
            Arrays.sort(num);
            for (int i=0;i<num.length-1;i++){
                if(num[i]==num[i+1]){
                    return true;
                }
            }
            return false;
        }
    }
    public void main(String [] args]){

    }
}