public class mergeArrays{
    static int [] mergeArr(int [] a1,int [] a2){
        int [] merger= new int[a1.length + a2.length];
        int i=0; int j=0; int k=0;
        while(i<a1.length&&j<a2.length){
            if(a1[i]<a2[j]){
                merger[k]=a1[i];
                i++;
            }
            else{
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
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int med=0;
        int reg[]=new int[nums1.length+nums2.length];
        int i=0;int j=0; int k=0;
        while(i<nums1.length && j<nums2.length){
            reg[k]=(nums1[i]>nums2[j])? nums2[j]:nums1[i];
            if(nums1[i]>nums2[j]){
                j++;
                
            }
            else{
                i++;
                
            }
            k++;
        }
            while(i<nums1.length){
                reg[k]=nums1[i];
                i++;k++;
            }
            while(j<nums2.length){
                reg[k]=nums2[j];
                j++;k++;
            }
        med=reg.length%2;
        if(med!=0){
            double me=reg[(int) ((reg.length/2))];
            return me;
        }
        else{
            double me=(reg[reg.length/2]+reg[(reg.length/2)-1])/2.0;
               return me;         
        }
        
    }
    public static void main(String[] args) {
        int[] arr={3,5,7};
        int[] narr={1,2,4};
        int [] z=mergeArr(arr,narr);
        double x=findMedianSortedArrays(arr,narr);
        for(int i=0;i<z.length;i++){
            System.out.print("-->"+z[i]);
        }
        System.out.print("-->"+x);
    }

}