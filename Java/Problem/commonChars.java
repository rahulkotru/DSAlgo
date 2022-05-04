class commonChars{
    class Solution{
        public List<String> common(String arr[]){
            List<String> commonChars=new ArrayList();
            int [] minFreq=new int[26];
            Arrays.fill(minFreq,Integer.MAX_VALUE);
            for (String current: arr){
                int [] charFreq=new int[26];
                for (char c: current.toCharArray()){
                    charFreq[c-'a']++;
                }
                for(int i=0;i<26;i++){
                    
                }
            }
        }
    }
    public static void main(String args[]){

    }
}