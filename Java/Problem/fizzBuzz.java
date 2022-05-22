class fizzBuzz{
    class Solution{
        public List<String> fizzB(int n){
            List<String> outputArr=new ArrayList();
            for(int i=1,fizz=0,buzz=0;i<=n;i++){
                fizz++;
                buzz++;
                if(fizz==3&&buzz==5){

                }
                else if(fizz==3){
                    fizz=0;
                    buzz==0;
                }
                else if(fizz==3){
                    fizz=0;
                    outputArr.add("Fizz");
                }
                else if(buzz==5){
                    outputArr.add("Buzz");
                }
            }
        }

    }
    public static void main(String[] args) {
        
    }
}