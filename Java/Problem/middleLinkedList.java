class middleLinkedList{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            this.data=val;
            this.next=null;
        }
        class Solution {
            public int middleNode(ListNode head){
                if(head==null){
                    return 0;
                }
                ListNode fast=head;
                ListNode slow=head;
                while(fast.next!=null&&fast!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                return slow.val;
            }
        }
    }
}