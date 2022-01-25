import java.util.*;
public class DoubleLinkList{
    private ListNode head;
    private ListNode tail;
    private int length;

    public DoubleLinkList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public void insertlast(int data){
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
    public void displayForward(){
        if(head==null){
            return ;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp = temp.next;

        }
        System.out.println("null");
    }
    public void displayBackward(){
        if (tail==null){
            return;
        }
        ListNode temp =tail;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp=temp.prev;
        }
        System.out.println("null");
    }
    public void insertFirst(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            tail=newNode;
        }
        else{
            head.prev=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;

    }
    public void insertEnd(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
        length++;
    }
    public ListNode deleteFirst(){
        if(head==null){
            throw new NoSuchElementException();
        }
        ListNode temp=head;
        if(head==tail){
            tail=null;
        }
        else{
            head.next.prev=null;
        }
        head=head.next;
        temp.next = null;
        length--;
        return temp;
    }
    public ListNode deleteLast(){
        if(head==null){
            throw new NoSuchElementException();
        }        
        ListNode temp=tail;
        if(head==tail){
            head=null;
        }    
        else{
            tail.prev.next=null;
        }
        tail=tail.prev;
        temp.prev=null;
        length--;
        return temp;
    }

    public static void main(String[] args){
        DoubleLinkList dl =new DoubleLinkList();
        
    }


}