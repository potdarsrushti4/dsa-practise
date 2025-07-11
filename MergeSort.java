//recursion
import java.util.Arrays;
public class MergeSort{
    public static void mergeSort(int[] arr,int si,int ei)
    {
        //base case
        if(si>=ei)
        {
            return;
        }

        //actual work
        //divide
        int mid = si + (ei - si)/2;

        //Recursive call merge sort left part
        mergeSort(arr, si, mid);

        //Recursive call merge sort right part
        mergeSort(arr, mid+1, ei);

        //merge the sorted arrays
        merge(arr, si, mid, ei);
        
    }

    public static void merge(int[] arr,int si,int mid,int ei)
    {
        int[] temp=new int[ei-si+1];
        int i = si; //iterator for left part;
        int j = mid+1; //iterator for right part;
        int k = 0;

        while(i<= mid && j <= ei) // yaha && rakhna padega kyuki sometimes ek part sort hojata hai and i & j can go out of index and still it will compare it with the out of index iterator 
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
                //k++; 
            }
            else{
                temp[k] = arr[j];
                j++;
                //k++;
            }
            k++; //since in both the cond same task was poerformed we wrote it here
        }

        //now in above AND condition there can be a case in which only one is true and secomd is false but, since its AND we will get out of loop and one part is left unsorted so in that case we check the conditons again separately, sometimes in some elements are left to store in temp array
        
        //left part
        while(i<=mid)
        {
            temp[k++] = arr[i++]; //first stores the values then increments
            //i++;
            
        }
        //right part
        while(j<=ei)
        {
            // if(arr[j] < arr[i])
            // {
                temp[k++] = arr[j++];
            // }
        }

        //copy temp[] to org[]
        for(k=0, i=si;k<temp.length; k++, i++)
        {
            arr[i] = temp[k];
        }
 
    }
    public static void main(String[] args) {
        int[] arr ={6,3,9,5,2,8,-3};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}