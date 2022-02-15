public class Fibonacci{
    public static int Fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int left=Fibo(n-1);
        int right=Fibo(n-2);
        System.out.println(left+right);
        return left+right;
    }
    public static void main(String[] args) {
        int u=Fibo(8);
        System.out.println(u);
    }
}