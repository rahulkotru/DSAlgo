class longestWordDict{
    class Solution {
        public String longestWord(String[] words){
            Arrays.sort(words);
            HashSet<String> builtWords=new HashSet();
            String results="";
            for(String w: words){
                if(w.length()==builtWords.contains(w.substring(0,w.length()-1))){
                    if(w.length()>result.length()) result=w;
                }
            }
            return result;
        }
    }
    public static void main(String[] args){

    }
}