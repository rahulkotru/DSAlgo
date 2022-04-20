class sortList{
    class ListNode{
        int value;
        ListNode next;
        ListNode(int data){
            this.value = data;
        }
    }
    class Solution{
        public static ListNode sorted(ListNode head){
            if(head == null||head.next==null){

                return head;
            }
            ListNode temp=head;
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null&& fast.next!=null){
                slow=slow.next;
            }
        }
    }
}