public class mergeArrays{
    static int [] mergeArr(int [] a1,int [] a2){
        int [] merger= new int[a1.length + a2.length];
        int i=0; int j=0; int k=0;
        while(i<a1.length&&j<a2.length){
            if(a1[i]<a2[j]){
                merger[k]=a1[i];
                i++;
            }
            if(a1[i]>a2[j]){
                merger[k]=a2[j];
                j++;
            }
            k++;
        }
        while(i<a1.length){
            merger[k]=a1[i];
            i++;k++;
        }
        while(j<a2.length){
            merger[k]=a2[j];
            j++;k++;
        }
        return merger;
    }
    public static void main(String[] args) {
        int[] arr={3,4,7,8};
        int[] narr={1,2,5,6};
        int [] z=mergeArr(arr,narr);
        for(int i=0;i<z.length-1;i++){
            System.out.print("-->"+z[i]);
        }

    }
}