public class AddSingleList{
    private ListNode head;
    

    private class ListNode{
        private int data;
        private ListNode head;

        public ListNode(int data){
            this.data = data;
            this.head=null;
        }
    }
    public ListNode addList(ListNode a, ListNode b){
        ListNode current=new ListNode(0);
        ListNode dummy=current;
        int carry=0;
        while(a!=null||b!=null){
            int x= (a!=null)? a.data:0;
            int y=(b!=null)? b.data:0;
            int sum=carry+x+y;
            carry=sum/10;
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            if(a!=null){
                a=a.next;
            }
            if(b!=null){
                b=b.next;
            }
            if (carry>0){
                dummy.next=new ListNode(carry);
            }
            
        }
        return current.next;
    }

    public static void main(String[] args) {
        ListNode x=new ListNode();
        x.head=new ListNode(9);
    }
}