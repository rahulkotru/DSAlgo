class alienWorld{
    class Solution {
        public int[] charMap;
        public boolean alienSort(String [] words, String order){
            charMap= new int[26];
            for(int i=0; order.length();i++){
                charMap[order.charAt(i)-'a']=i;
            }
        }
    }
    public static void main(String args[]){

    }
}