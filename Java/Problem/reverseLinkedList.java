class reverseLinkedList{
    private ListNode;
    class ListNode{
        ListNode next;
        int data;
        ListNode(int val){
            data=val;
        }
    }
    class Solution{
        ListNode reverseLinkedList(ListNode head){
            
            ListNode prev;
            ListNode current=head.next;
            while(head.next!=null){
                ListNode next=head.next;
                current.next=prev;
                prev=head;
                head=next; 

                
            }
            
        }
    }
    public static void main(String[] args){

    }
}