class handOf Straight{
    class Solution {
        public boolean straightEdge(int [] cards, int W){
            TreeMap<Integer, Integer> cardCounts=new TreeMap();
            for(int card :cards ){
                if(!cardCounts.containsKey(card)){
                    cardCounts.put(card,1);
                }
                else{
                    cardCounts.replace(card,cardCounts.get(card)+1);
                }
            }
            
        }
    }
}