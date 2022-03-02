class oddEvenList{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            this.data=val;
        }
    }
    public ListNode oddEven(ListNode root){
        if(root==null){
            return root;
        }
        
        ListNode odd=root;
        ListNode even=head.next;
        ListNode evenHead=even;
        while(even.next!=null&&even!=null){
        odd.next=even.next;
        odd=even.next;
        even.next=odd.next;
        even=even.next;
        }
        odd.next=evenHead;
        return head;

    }
    public static void main(String[] args){
        
    }
}