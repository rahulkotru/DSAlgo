class swapTwice{
    class ListNode{
     int val;
     ListNode next;
     ListNode (int data){
         this.val=data;
     }   
    }
    class Solution{
        public ListNode doubleSwap( ListNode head){
            if(head == null){
                return head;
            }
            ListNode temp=new ListNode(0);
            temp.next=head;
            ListNode current =temp;
            while(current.next!=null&& current.next.next!=null){
                ListNode first=current.next;
                ListNode second=current.next.next;
                first.next=second.next;
            }
        }
    }
}