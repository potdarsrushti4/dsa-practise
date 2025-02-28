import java.util.Arrays;
public class Selection_sort{
    public static void selectionSort(int[] arr)
    {
        /*this is opposite of bubble sort here the placing of elements starts from front where as in bub sort the elements were placed at last. one element is considered as smallest and compared with all other elements then the smallest is placed in the begining 
        */
       for (int i = 0; i < arr.length-1; i++) {
        
           int min = i; // this plays a significat role it shows that as loop is going on further the begining array goes on sorting so will start from the i^th position from next iteration
           for(int j = i+1 ; j<arr.length;j++)
           {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
           }
           //swap

           int temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
       }
       System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        int[] arr = {5,-4,3,2,1};
        selectionSort(arr);
    }
}