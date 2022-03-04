class stringPalindrome{
    public static boolean isPalindrome(String s){
        String fixed="";
        for (char c:s.toCharArray()){
            if(Character.isDigit(c)||Character.isLetter(c)){
                fixed+=c;
            }
            fixed=fixed.toLowerCase();
            int start=0;
            int end=fixed.length()-1;
            while(start>=end){
                if(fixed.charAt(start)!=fixed.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;

        }
    }
    public static void main(String[] args){
        
    }
}