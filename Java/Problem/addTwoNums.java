class addTwoNums{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            this.data=val;
        }
    }
    class Solution{
        public ListNode addTwoNums(ListNode l1, ListNode l2){
            if(l1.next==null ){
                return l2;
            }
            if(l2.next==null){
                return l1;
            }
            
        }
    }
    public static void main(String args[]){

    }
}