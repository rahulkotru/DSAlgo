class partitionList{
    class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            this.val=data;
        }

    }
    class Solution{
        public ListNode partition(ListNode head, int target){
            ListNode beforeHead=new ListNode(0);
            ListNode before=beforeHead;
            ListNode afterHead=new ListNode(0);
            ListNode after=afterHead;
            while(head!=null){
                if(head.val<target){
                    before.next = head;
                    before=before.next;
                    
                }
            }
        }
    }
}