class twoSum{
    

    class Solution{

        class ListNode{
        
            ListNode head;
            int data;
            ListNode(int val){
                data=val;
            }
        }
        public int [] twoSum(int [] arr, int target){
            int pointer1,pointer2;
            pointer1=0;
            pointer2=arr.length-1;
            while(pointer1<pointer2){
                if(arr[pointer1]+arr[pointer2]>target){
                    pointer2=-1;
                }
                else if(arr[pointer1]+arr[pointer2]<target){
                    pointer1=+1;
                }
                else if(arr[pointer1]+arr[pointer2]==target){
                    return new int[]{pointer1+1,pointer2+1};
                }
                
                }
            }return new int[]{pointer1+1,pointer2+1};
        }

    }
    public static void main(String args[]){

    }
}