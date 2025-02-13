public class Diagonal_sum{

    public static int diagonal_sum(int[][] matrix)
    {
        int sum=0;
        for(int i =0;i<matrix.length;i++) 
        /*ye loop cond actual matrix ka length dera hai [[],[],[]]
            jaise yaha array contains 3 sub arrays in it toh 3 bar chalega ye loop
        */
        {
            for(int j=0;j<matrix[0].length;j++)
            //ye loop will work according to the element present in each sub array
            {
                if(i==j)
                {
                    sum+=matrix[i][j];
                }
                else if((i+j)==matrix.length-1)
                {
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int[][] matrix={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        int result=diagonal_sum(matrix);
        System.out.print(result);
        
    }
}