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
    public void push(int num){
        ListNode l1= new ListNode(num); 
        l1.next=head;
        head=l1;
    }
    public void push_end(int num){
        ListNode l2= new ListNode(num);
        if(head==null){
            head=l2;
            return;
        }
        ListNode current=head;
            while(current.next!=null){
                current=current.next;        
        }
        current.next=l2;
    }
    public void push_mid(int node, int value){
        ListNode l3= new ListNode(value);
        if(head==null){
            push(value);
            return;
        }else{
            ListNode previous=head;
            int count=1;
            while(count<node-1){
                previous=previous.next;
                count++;
                }
            ListNode current =previous.next;
            l3.next=current;
            previous.next=l3;
            }
    }
    public ListNode pop(){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;


    }
    public ListNode pop_last(){
        if(head==null){
            return null;
        }
        ListNode previous=head;
        ListNode current=previous.next;
        while(current.next!=null){
            current=current.next;
            previous=previous.next;
        }
        previous.next=null;
        return null;
    }
    public void pop_position(int pos){
            ListNode current=head;
            ListNode temp=current.next;
            int count=0;
        if(head==null){
            System.out.printf("Empty");
        }
        else if(pos==0){
            pop();
        }
        else{
            
            while(count<pos){
                if(count==0){
                    temp=temp.next;    
                }
                else{
                current=current.next;
                temp=temp.next;
                }
                count++;
            }
            current.next=temp;
        }
        
        
    }
    public boolean search_node(int val){
        ListNode current=head;
        while(current !=null){
            if(current.data==val){
                return true;
            
            }
            current=current.next;
        }
        return false;
    }
    public ListNode reverse_list(ListNode head){
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current.next!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
            System.out.println(next.data +"-->");
        }
        return previous;
    }
    /*public int mid_val(){
        if(head==null){
            return 0;
        }
        else{
            int count=0;
            ListNode current=head;
            ListNode nexa=head;
            while(nexa.next!=null){
                nexa=nexa.next;
                count++;
            }
            if(count%2==0){
                count=count/2;
            }
            else{
                count=(count

            }

        }
    }


    /* I can create as many instances of ListNode as I want, be it first, second, tenth, previous, current, next*/
    public static void main(String[] args) {
        SinglyLinkedList sll= new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second= new ListNode(1);
        ListNode third =new ListNode(8);
        ListNode fourth= new ListNode(11);

        sll.head.next= second;
        second.next=third;
        third.next=fourth;
        
        sll.push(77);
        sll.push(0);
        sll.push_end(90);
        sll.push_mid(2,67);
        sll.display();
        System.out.printf("The Length is: "+sll.length());
        System.out.printf("\nPopped out: "+sll.pop().data); 
        sll.pop_last();
        System.out.printf("\nNew List: ");
        sll.display();
        sll.pop_position(4);
        sll.display();
        System.out.print("Does number exist: "+ sll.search_node(11)+'\n');
        ListNode neu= sll.reverse_list(fourth);
        


    }

}