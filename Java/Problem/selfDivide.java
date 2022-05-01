class selfDivide{
    class Solution{
        public static isSelfDivide(int left, int right){
            List<Integer> selfDivisionNums=new ArrayList();
            for(int i=left;i<=right;i++){

            
                if(isSelfDividing(i)) selfDivisionNums.add(i);
            }   
            return selfDivisionNums;        
        }
    }
    public static void main(String [] args){

    }
}