class Solution{
    public static int numJewels(String J, String S){
        int numJewels=0;
        for(int i=0;i<S.length();i++){
            if(J.indexOf(S.charAt(i))>-1){
                numJewels++;
            }
        }
    }
}