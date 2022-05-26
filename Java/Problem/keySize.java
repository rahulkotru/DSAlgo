class keySize{
    class Solution {
        public String keyCheck(String key, int k){
            key=key.toUpperCase();
            key=key.replaceAll("-"," ");
            StringBuilder sb=new StringBuilder();
            for(int i=S.length()-k;i>0;i=i-k){
                sb.insert(i,"-");
            }
            return sb.toString();
        }
    }
    public static void main(String[] args){

    }
}