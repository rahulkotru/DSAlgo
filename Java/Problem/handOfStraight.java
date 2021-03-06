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
            while(cardCounts.size() >0){
                int firstCard=cardCounts.firstKey();
                for (int i=firstCard; i<firstCard+W;i++){
                    if(!=cardCounts.containsKey(i)) return false;
                    int count=cardCounts.get(i);
                    if(count==1){
                        cardCounts.remove(i);
                    }
                    else{
                        cardCounts.replace(i, cardCounts.get(i)-1);
                    }
                }
            }
            return true;
        }
        public static void main(String[] args){
            
        }

    }
}