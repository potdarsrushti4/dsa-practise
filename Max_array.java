import java.util.Arrays;

public class Max_array{
    public static void main(String[] args)
    {
        int[] arr={45,23,5,80,10};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Max element : "+max);
    }
}