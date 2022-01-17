public class Stacks{
    private ListNode top;//Instance Variables
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
    

        public ListNode(int data){//Constructor for LinkNode
            this.data=data;
        }
    }
    public Stacks(){//Constructor
        top=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public void push(int data){
        ListNode temp= new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int pop(){
        int result =top.data;
        length--;
        return result;
    }
    
    public static void main(String[] args) {
        Stacks newStack= new Stacks();
        newStack.push(10);
        newStack.push(20);
        newStack.push(44);
        
    }

}