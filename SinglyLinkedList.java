public class SinglyLinkedList{
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next=null;
        }
    }

    public void display(){
        ListNode current =head;
        while(current !=null){
            System.out.printf(current.data+"-->");
            current=current.next;
        }
        System.out.println("NULL");
    }
    public int length(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current =head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public void insert_at_head(int num){
        ListNode l1= new ListNode(num); 
        l1.next=head;
        head=l1;
    }

   /* public void insert_end(int num){
        LinkNode l2= new LinkNode(num);
        if(head==null){
            l2.next=null;
            head=l2;
            return;
        }
        
            while(l2.next!=null){

        
        }
    }*/
        
    public static void main(String[] args) {
        SinglyLinkedList sll= new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second= new ListNode(1);
        ListNode third =new ListNode(8);
        ListNode fourth= new ListNode(11);

        sll.head.next= second;
        second.next=third;
        third.next=fourth;
        
        sll.insert_at_head(77);
        sll.insert_at_head(0);
        sll.display();
        System.out.printf("The Length is "+sll.length());


    }

}