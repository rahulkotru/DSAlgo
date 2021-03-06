class removeKDigits{
    class Solution{
        public String removeDigits(String nums, int k){
            int size=nums.length;
            if(k==size) return '0';
            Stack<Character> stack=new Stack();

            int counter=0;
            while(counter<size){
                while(k>0&&!stack.isEmpty()&& stack.peek()>nums.charAt(counter)){
                    stack.pop();
                    k--;
                }
                stack.push(nums.charAt(counter));
                counter++;
            }
            while(k>0){
                stack.pop();
                k--;
            }
            StringBuilder sb=new StringBuilder();
            while(!stack.isEmpty()){
                char currentChar=stack.pop();
                sb.append(currentChar);
            }
            sb.reverse();
            while(sb.length()>1 && sb.charAt(0)=='0'){
                sb.deleteCharAt(0);
            }
            return sb.toString();
        }

    }
    public static void main(String[] args){

    }
}