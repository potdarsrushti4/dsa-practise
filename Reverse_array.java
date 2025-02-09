
import java.util.Arrays;

public class Reverse_array{
    public static void main(String[] args) {
        int start,end;
        int temp;
        int[] arr={54,89,23,6,10};
        // int[] reverse=new int[arr.length];
        System.out.println(Arrays.toString(arr));
        start=0;
        end=arr.length-1;

        while(start!=end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}