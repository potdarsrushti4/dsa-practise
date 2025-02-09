import java.util.Arrays;
import java.util.Scanner;
public class swap_array{
    public static void main(String[] args)
    {
        int[] arr=new int[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        swap_array obj=new swap_array();
        obj.swap(arr,2,4);
    }

    // swap_array obj=new swap_array();
    public void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];

        arr[index1]=arr[index2];

        arr[index2]=temp;

        System.out.print(Arrays.toString(arr));
    }
}