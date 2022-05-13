class removeKDigits{
    class Solution{
        public String removeDigits(String nums, int k){
            int size=nums.length;
            if(k==size) return '0';
            Stack<Character> stack=new Stack();

            int counter=0;
            while(counter<size){
                while(k>0&&!stack.isEmpty()&& stack.peek()>nums.charAt(counter)){
                    
                }
            }
        }

    }
    public static void main(String[] args){

    }
}