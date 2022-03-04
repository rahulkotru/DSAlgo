class cyclicLinkedList{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            this.data=val;
            this.next=null;
        }
        public static boolean isCyclic(ListNode head){
            if(head==null){
                return false;
            }
            ListNode current=head;
            ListNode faster=head.next;
            while(faster!=current){
                if(faster.val==current.val){
                    return true;
                }
                current=current.next;
                faster=faster.next.next;
                
            }
        }
    }

}