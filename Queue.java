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
    public static void main(String[] args) {
        Queue q= new Queue();
        q.addNode(10);
    }
}