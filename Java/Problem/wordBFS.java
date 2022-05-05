class wordBFS{
    class Solution{
        public int wordle(String begin, String end,List<String> bagOWords){
            HashSet<String> set=new HashSet();
            for(String word: bagOWords){
                set.add(word);
            }
            if(!set.contains(end)){
                return 0;
            }
            Queue <String> queue =new LinkedList();
            queue.add(begin);
            int level=1;
        }
    }
    public static void main(String args[]){

    }
}