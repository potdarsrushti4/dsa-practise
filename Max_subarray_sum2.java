public class Max_subarray_sum2{

    public static void prefix_array(int[] arr){
        int prefix_array[] = new int[arr.length];
        prefix_array[0] = arr[0];

        /*calculating prefix array where each element is sum upto its previous elements
         that's why its called prefix ARRAY

        */
        for (int i = 1; i < prefix_array.length; i++) {
           
            prefix_array[i]=prefix_array[i-1] + arr[i];
            
        }

        int maxSum = Integer.MIN_VALUE;
        int currSum ;

        for(int i = 0; i<arr.length ; i++)
        {
            int start=i;
            for(int j = i; j < arr.length ; j++)
            {
                int end=j;
                /*first condition when index will be 0 then after doing -1 it will give negative index
                second condition =>
                when u do end-(start-1)
                in prefix we know that every element is sum of its previous elements so 
                start-1 i.e we minus the sum before start index from end index value

                */
                currSum = start==0 ? prefix_array[end] : prefix_array[end] - prefix_array[start-1];
                
                if(currSum>maxSum)
                {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max sum is : "+maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        prefix_array(arr);

    }
}