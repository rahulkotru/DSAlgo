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
                else{
                    after.next=head;
                    after=after.next;
                }
                head=head.next;
            }
            after.next=null;
            before.next=afterHead;
            return beforeHead.next;
        }
    }
    public static void main(String args[]){
        
    }
}