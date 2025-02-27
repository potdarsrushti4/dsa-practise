
import java.util.Arrays;

public class Bubble_sort{

    public static void bubbleSort(int[] arr)
    {
        //this loop is for how many times in total the arr goes into comparisons 
        for(int turn = 0; turn<arr.length-1; turn++)
        {
            /*in this loop in each iteration in the end elements are sorted 
            so no need to compare them again so we do -turn here
            */
            for(int j = 0; j<arr.length-1-turn; j++)
            {
                //swapping

                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {4,-5,1,3,-2};
        bubbleSort(arr);
    }
}