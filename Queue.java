public class Queue{
    private ListNode head;//Instance Variables
    private ListNode tail;//Instance Variables
    private int length;

    public Queue(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;

        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void addNode(int data){
        ListNode temp=new ListNode(data);
        if(isEmpty()){
            head=temp;
        }
        else{
            tail.next=temp;
        }
        tail=temp;
        length++;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("NULL");
        }
        else{
            ListNode temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
    }
    public int deQueue(){
        if(isEmpty()){
            return 0;
        }
        else{
            int temp=head.data;
            head=head.next;
            if(head==null){
                tail=null;
            }
            length--;
            return temp;

        }
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.addNode(10);
       // q.addNode(20);
        q.display();
        int y=q.deQueue();
        q.display();
    }
}