class removeDuplicate{
    class Solution{
        public String removeDupes(String s){
            char [] stack=new char[s.length()];
            int i=0;
            for(int j=0;j<s.length();j++){
                char currentChar=s.charAt(j);
                if(i>0&& stack[i-1]==currentChar){
                    i--;
                }
                else{
                    
                }
            }
        }
    }
    public static void main(String[] args){

    }
}