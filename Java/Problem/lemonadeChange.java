class lemonadeChange{
    class Solution{
        public boolean lemonadeChange(int[] bills){
            int fives=0;
            int tens=0;
            for(Integer bill :bills){
                if(bill==5){
                    fives++;
                }
                else if(bill==10){
                    ten++;
                    fives--;
                }
                else if(tens>0){
                    ten--;
                    fives--;
                }
                else{
                    fives-=3;
                }
            }
        }
    }
    
    public static void main(String[] args){

    }
}