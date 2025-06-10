//Search target element in sorted and rotated array
public class SortedRotatedArray
{
    public static int search(int[] arr,int si, int ei,int target){

        //base case
        if(si>ei)
        {
            return  -1;
        }
        //actual kaam
        int mid = si+(ei-si) / 2;

        //case 1 : mid is target
        if(arr[mid] == target)
        {
            return mid;
        }

        //case 2 : mid is on Line 1
        if(arr[si] <= arr[mid])
        {
            //case a : target is on left of L1
            if(arr[si] <= target && target <= arr[mid])
            {
                return search(arr, si, mid, target);
            }
            else{
                //case b : target is on right L1 followed by L2
                return search(arr, mid+1, ei, target);
            }
        }
        //case 2 : mid is on L2
        else{
            //case c : right of l2
            if(arr[mid] <= target && target <= arr[ei])
            {
                return search(arr, mid+1, ei, target);
            }
            else{
                //case d : left
                return search(arr, si, mid-1, target);
            }
        }



    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,0,1,2};
        int index = search(arr, 0, arr.length-1, 2);
        System.out.println(index);
    }
}