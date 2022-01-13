public class DoubleLinkList(){
    private ListNode head;
    private ListNode tail;
    private int length;

    public DoubleLinkList(){
        this.next=null;
        this.prev=null;
        this.length=0;
    }
    private class ListNode(){
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data){
            this.data=data;
        }
    }

    public insertlast(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
        }
        else{
        tail.next=newNode;
        }
        newNode.prev=tail;
        tail=newNode;
        length++;
    }

    

    public static void main(String[] args){
        DoubleLinkList dl =new DoubleLinkList();
        ListNode data1=
    }


}