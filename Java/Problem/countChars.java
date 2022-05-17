class countChars{
    class Solution{
        public int countCharacter(String [] words, String chars){
            int goodWordLengthSum=0;
            int [] charCount=new int[26];
            for (char c: chars.toCharArray()){
                charCount[c-'a']++;
            }for(String word : words){
                int[] tempChar=Arrays.copyOf(charCount,CharCount.length());
            }

            return goodWordLengthSum;
        }
    }
    public static void main(String args[]){

    }
}