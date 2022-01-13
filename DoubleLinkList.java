public class DoubleLinkList(){
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode(){
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
}