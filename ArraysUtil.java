public class ArraysUtil{
    public static void printArray(int [] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int newArr[]=new int[5];
        printArray(newArr);
        newArr[0]=5;
        newArr[1]=1;
        newArr[2]=8;
        newArr[3]=2;
        newArr[4]=10;
        printArray(newArr);
        System.out.println(newArr.length-1);
    }
    public static int[] evenInt(int [] arr){
            int count=0;
            for (int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    count++;
                }
            }
            int j=0;
            int[] jarr= new int[count];
            for (int i=0 ;i<arr.length;i++){
                if(arr[i]%2==0){
                    jarr[j]=arr[i];
                    j++;
                }
            }
            return jarr;
    }

    public static void main(String[] args) {
       // ArraysUtil arr=new ArraysUtil();
       // arr.arrayDemo();
        int newInt[]={5,4,6,3,1};
        printArray(newInt);
        int res[]= evenInt(newInt);
        printArray(res);

    }
}