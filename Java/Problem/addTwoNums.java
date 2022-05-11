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
            ListNode dummy=next;
            while(l1!=null||l2!=null){
                int l1Val= (l1.data!=null)? l1.data:0;
                int l2Va=(l2.data!=null)? l2.data:0;
            }
        }
    }
    public static void main(String args[]){

    }
}