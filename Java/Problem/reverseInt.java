class reverseInt{
    public static void main(String[] args){
        int reversed=0;
        int pop;
        int x=123;
        while(x!=0){
            pop=x%10;
            x/=10;
            reversed=(reversed*10)+pop;
        }
        System.out.println(reversed);
    }
}