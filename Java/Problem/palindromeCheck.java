class palindromeCheck{
    class Solution {
        class ListNode{
            ListNode next;
            int data;
            ListNode(int val){
                this.data=val;
                this.next=null;
            }
            public boolean isPalindrome(ListNode head){
                ListNode slow=head;
                ListNode fast=head;
                while(fast=!null||fast.next!=null){
                    fast=fast.next.next;
                    slow=slow.next;
                }
                slow=reverse(slow);
                fast=head;
                while(slow!=null){
                    if(slow.data!=fast.data){
                        return false;
                    }
                    slow=slow.next;
                    fast=fast.next;
                }
                return true;
            }
            public ListNode reverse(ListNode head){
                ListNode prev=head;
                while(prev!=null){
                    ListNode next=head.next;
                    head.next=prev;
                    prev=head;
                    head=next;
                }
                return prev;
            }
        }    
    
    
    }
    public static void main(String[] args){

    }
}