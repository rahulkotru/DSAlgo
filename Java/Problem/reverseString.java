class reverseString{
    public static reverse(char c[]){
        int start=0;
        int end=c.length-1;
        while(start>=end){
            char temp=c[start];
            c[start]=c[end];
            c[end]=c[start];
            start+=1;
            end-=1;
        }
    }
    public static void main(String[] args){
        
    }
}