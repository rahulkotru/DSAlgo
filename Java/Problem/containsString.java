class containsString{
    class Solution{
        public boolean rotateString(String A, String B){
            return (A.length()==B.length() && (A+A).contains(B));
        }
    }
    public static void main(String args[]){

    }
}