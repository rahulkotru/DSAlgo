class fruitOfTheLoom{
    class Solution{
        public int totalFruit(int[] tree){
            int lastFruit = -1;
            int secondLast = -1;
            int lastFruitCount= 0;
            int currentMax=0;
            for(Integer fruit:tree){
                if (fruit==lastFruit|| fruit==secondLastFruit){
                    currentMax+=1;
                }
                else{
                    currentMax=lastFruitCount+1;
                }
                if(fruit==lastFruit){
                    lastFruitCount+=1;
                }
            }
        }
    }
    public static void main(String [] args){

    }
}