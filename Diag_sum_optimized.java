// This is optimized diag sum

public class Diag_sum_optimized
{
    public static void main(String[] args)
    {
        int sum=0;
        int[][] matrix={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        for(int i =0;i<matrix.length;i++)
        {
            //primary diagonal 
            sum+=matrix[i][i];

            //secondary diagonal
            /*
            as we know SD conists of n-1 so we check for i+j==n-1
            here we know i,n and 1 value so we'll derive j
            j=n-1-i 
            */

           sum+=matrix[i][matrix.length-1-i];

        }
        System.out.print(sum);
    }
}