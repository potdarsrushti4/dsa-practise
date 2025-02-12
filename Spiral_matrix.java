public class Spiral_matrix
{
    public static void spiral(int[][] matrix)
    {
        int start_row=0;
        int end_col=matrix[0].length-1;

        int end_row=matrix.length-1;
        int start_col=0;

        while(start_row<=end_row && start_col<=end_col)
        {
            //top
            for(int i=start_col;i<=end_col;i++)
            {
                System.out.print(matrix[start_row][i]+" ");
            }

            //right
            for(int j=start_row+1;j<=end_row;j++)
            {
                System.out.print(matrix[j][end_col]+" ");
            }

            //bottom
            for(int i=end_col-1;i>=start_col;i--)
            {
                /*when it comes to odd matrix the there can be issue where there is 
                only one element left so it will be printed in top row loop then again 
                in bottom row loop so to avoid duplicatiob we write this condition
                */
                if(start_row==end_row)
                {
                    return;
                }
                System.out.print(matrix[end_row][i]+" ");
            }

            //left
            for(int j=end_row-1;j>=start_row+1;j--)
            {
                //as mentioned earlier to avoid duplication of both columns we write
                if(start_col==end_col)
                {
                    return;
                }
                System.out.print(matrix[j][start_col]+" ");
            }

            start_row++;
            end_col--;
            end_row--;
            start_col++;


        }
    }
    public static void main(String[] blow)
    {
        int[][] matrix={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        
        spiral(matrix);
    }
}