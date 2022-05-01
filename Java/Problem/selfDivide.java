class selfDivide{
    class Solution{
        public static isSelfDivide(int left, int right){
            List<Integer> selfDivisionNums=new ArrayList();
            for(int i=left;i<=right;i++){

            
                if(isSelfDividing(i)) selfDivisionNums.add(i);
            }   
            return selfDivisionNums;        
        }
        public boolean isSelfDividing(int num){
            for(char c:String.valueOf(num).toCharArray()){
                
            }
        }
    }
    public static void main(String [] args){

    }
}