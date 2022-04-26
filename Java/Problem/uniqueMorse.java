class uniqueMorse{
    class Solution {
        public int transformMorse(String [] words){
            HashSet<String> uniqueCodes=new HashSet();
            String Morse[]=new String[]{""};
            for (word :words){
                StringBuilder transformation=new StringBuilder();
                for (char c: word.toCharArray()){
                    transformation.append(c-'a');
                }
                uniqueCodes.add(transformation.toString());
            }
            return uniqueCodes.size();
        }
    }
    public static void main(String[] args){

    }
}