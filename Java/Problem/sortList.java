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
                temp=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            temp.next=null;
            ListNode left=sorted(head);
            ListNode right=sorted(slow);
            return merge(left,right);
        }
    }
}