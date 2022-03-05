class mergeList{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            this.data=val;
            this.next=null;
        }
    }
    class Solution{
        public static ListNode mergeTwo(ListNode List1,ListNode List2){
            if(List1 == null){
                return List2;
            }
            if(List2 == null){
                return List1;
            }
            ListNode point1=List1;
            ListNode point2=List2;
            while(point1.next!=null||point2.next!=null){
                
            }
        }
    }
}