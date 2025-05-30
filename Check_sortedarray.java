//recursion problems on array
import java.util.Arrays;

public class Check_sortedarray{
    //to find first occurence of an element
    public static int occurence(int arr[],int key,int i )
    {
        if (i==arr.length-1) return -1;
        if(arr[i] == key) return i;

        return occurence(arr, key, i+1);
    }

    //to find last occurence of an element

    public static int lastOccurence(int[] arr, int key,int i)
    {
        // System.out.println(i);
        if(i<0) return -1;

        if(arr[i] == key)
        {
            return i;
        }
        
        return lastOccurence(arr, key, i-1);
    }
    
    //To check is array is sorted
    public static boolean isSorted(int[] arr,int i)
    {
        if(arr.length == 0 ) 
        {System.out.println("Array is empty");return false;}
        if(i==arr.length-1) return true;

        if (arr[i] > arr[i+1])  return false;

        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {7,4,3,8,3,4,8,9,5};
        
        System.out.println(Arrays.toString(arr));
        // System.out.println(isSorted(arr, 0));
        System.out.println(occurence(arr, 5, arr.length-1));
    }
}