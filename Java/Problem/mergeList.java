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
            ListNode newList;
            while(point1.next!=null||point2.next!=null){
                int a=(point1.val>point2.val)? point1.val:point2.val;
                if(point1>point2){
                    point1=point1.next;
                }
                if(point1<point2){
                point2=point2.next;
                }
                newList(a);
        }
    }
}