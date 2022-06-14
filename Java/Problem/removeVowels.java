class removeVowels{
    class Solution{
        public static String remove(String S){
            if (S.equals("")) return "";
            return S.replaceAll("[aeiou]","");
        }
    }
    public static void main(String[] args){

    }
}