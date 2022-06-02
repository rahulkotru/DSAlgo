class commonWords{
    class Solution {
        public String mostCommon(String paragraph,String[] banned){
            HashSet<String> bannedWords= new HashSet();
            HashMap<String,Integer> validWords=new HashMap();
            for (String bannedWord: banned){
                bannedWords.put(bannedWord);
            }
            String[] words=paragraph.toLowerCase().split("\\%");
        } 
    }
    public static void main(String[] args){

    }
}