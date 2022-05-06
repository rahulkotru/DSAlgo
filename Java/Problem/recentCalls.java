class recentCalls{
    Queue <Integer> queue;
    class Solution{
        public Solution(){
            queue=new LinkedList();
        }
        public int ping(int t){
            queue.add(t);
            while(queue.peek()<t-3000){
                queue.poll();    
            }
            return queue.size();
        }
    }
    public static void main(String args[]){

    }
}