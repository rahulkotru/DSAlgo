class wordSubset{
    class Solution {
        public List<String> words(String [] A, String [] B){
            List<String> result=new ArrayList();

            int maxBFreq=new int[26];
            for(int i=0;i<B.length;i++){
                String currentWord=B[i];
                int[] charFreq=wordFreq(currentWord);
            }
            for(int j=0;j<26;j++){
                
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