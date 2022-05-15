class longestSubArrayPalindrome{
    class Solution{
        public String longestPalindrome(String s){
            if(S==null||s.length()<1) return "";
            int start=0;
            int end=0;
            for(int i=0;i<s.length();i++){
                int len1=expandFromMid(s,i,i);
                int len2=expandFromMid(s,i,i+1);
                int len3=Math.max(len1,len2);
            }
        }
    }
}s