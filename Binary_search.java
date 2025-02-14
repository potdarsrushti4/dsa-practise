public class Binary_search{

    public static int linear_search(int[] arr,int key)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=(start+end)/2;

            //comparsions
            if(arr[mid]==key)
            {
                /*at the end there will remain only one element and thats why a return 
                statement here so the control will come out of function
                */
                return mid;
            }
            //left half
            else if(key<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        //the above return statement will come true if there is elemnt 
        //if none of the above conditions is true then returns -1
        return -1;
    }
    public static void main(String[] args)
    {
        int key=60;
        int[] arr={10,20,30,40,50,60,70};

        int index=linear_search(arr,key);

        System.out.print("Element is found at index : "+index);
    }
}