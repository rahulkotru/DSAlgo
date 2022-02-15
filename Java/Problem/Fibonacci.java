public class Fibonacci{
    public static int Fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int left=Fibo(n-1);
        int right=Fibo(n-2);
        System.out.println(left+right);
        return left+right;
    }
    public static long fibo(int n){
        long[] arr=new long[n+2];
        arr[0] = 0;
        arr[1]= 1;
        for (int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        long u=fibo(8);
        System.out.println(u);
    }
}