public class ArraysUtil{
    public void printArray(int [] arr){
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
    }
    public static void main(String[] args) {
        ArraysUtil arr=new ArraysUtil();
        arr.arrayDemo();

    }
}