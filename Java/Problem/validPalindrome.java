class validPalindrome{
    class Solution{
        public boolean validate(String s){
            int i=0;
            int j=s.length();
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return helper(s, i+1, j) || helper(s, i, j+1);
                }
                i++;
                j--;
            }
            reutrn true;
        }
        public boolean helper(String s, int i, int j){
            int start=i;
            int end=j;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
    public static void main(String args[]){

    }
}