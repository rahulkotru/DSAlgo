class toLowerCase{
    public toLowercase(String str){
        String result = "";
        for(Char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                result=result+(char)(c+32);
            }
            else{
                result=result+c;
            }
            return result;
        }
    }
    public static void main(String[] args){
        
    }
}