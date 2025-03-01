
import java.util.Arrays;

public class Insertion_sort{

    public static void insertionSort(int[] arr)
    {
        for(int i = 1 ; i<arr.length ; i++)
        {
            int x = i;
            int var = arr[i];
            for(int j=i-1; j>=0; j--)
            {
                if(arr[j]<var) //this is for descending . for asec change >
                {
                    arr[x] = arr[j];
                    x--;
                }
                
            }
            arr[x]=var;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        int[] arr = {5,4,1,3,2};
        insertionSort(arr);


    }
}