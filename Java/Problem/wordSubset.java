class wordSubset{
    class Solution {
        public List<String> words(String [] A, String [] B){
            List<String> result=new ArrayList();

            for(int i=0;i<B.length;i++){
                String currentWord=B[i];
                int[] charFreq=wordFreq
            }
        }
        public int wordFreq(String S){
            int [] result=new int[26];
            for(char c:S.toCharArray()){
                result[c-'a']++;
            }
            return result;
        }


    }
    public static void main(String [] args){
        
    }
}