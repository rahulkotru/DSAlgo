class threeSumClosest{
    class Solution{
        public int closestSum(int [] arr, int target){   
            int result=arr[0]+arr[1]+arr[arr.length - 1];
            Arrays.sort(arr);
            for(int i=0;i<arr.length-2;i++){
                int start=arr[i];
                int end=arr.length-1;
                while(start<end){
                    int current=nums[i]+nums[start]+nums[end];
                }
                
            }
        }
    }
}