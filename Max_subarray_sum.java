public class Max_subarray_sum{

    public static void Max_subarray_sum(int[] arr)
    {
        int maxSum = Integer.MIN_VALUE;
        int currSum ;

        for(int i = 0; i<arr.length ; i++)
        {
            int start=i;
            for(int j = i; j < arr.length ; j++)
            {
                int end=j;
                currSum = 0;
                for(int k=start ; k <=end ; k++)
                {
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum)
                {
                    maxSum = currSum;
                }
            }
            
        }
        System.out.println("Max Sum of subarray is : "+maxSum);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,-2,6,-1,3};
        Max_subarray_sum(arr);
    }
}