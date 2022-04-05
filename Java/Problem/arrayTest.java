import java.util.Arrays;
public class arrayTest{
    public static void main(String[] args){
        int [][] arr={{1,2,4},{3,4,3},{5,5,3},{6,4,2},{8,1,3}};
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
        System.out.println(arr[3].length);
        System.out.println(arr.length);
        Arrays.fill(arr,1);
        System.out.println(arr.length)

    }
}