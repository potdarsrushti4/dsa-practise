public class Kadanes_algo{

    public static void kadanes(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            
            currSum += arr[i];
            if(currSum<0)
            {
                currSum = 0;
            }

            // if(maxSum<currSum)
            // {
            //     maxSum = currSum;
            // }

            maxSum =  Math.max(maxSum, currSum);

        }
        System.out.println("Max sum : "+maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {-1,-3,4,-2,6};
        kadanes(arr);

    }
}