public class Spiral_matrix{

    public static void sprial(int[][] matrix){
        
        int start_row=0;
        int end_col=matrix[0].length-1;
        int end_row=matrix.length-1;
        int start_col=0;
        //System.out.println(start_row+" "+end_col+" "+end_row+" "+start_col);
        while(start_row<=end_row && start_col<=end_col)
        {
            //top 
            for (int i = start_col; i <= end_col; i++) {
                System.out.print(matrix[start_row][i]+" ");
            }
            
            //right
            for(int j = start_row+1 ;j<=end_row;j++)
            {
                System.out.print(matrix[j][end_col]+" ");
            }

            //bottom
            for (int i = end_col-1; i >= start_col; i--) {
                System.out.print(matrix[end_row][i]+" ");
            }

            //left
            for(int j=end_row-1;j>=start_row+1;j--)
            {
                System.out.print(matrix[j][start_col
                ]+" ");
            }
            start_col++;
            end_col--;
            start_row++;
            end_row--;
        }
            
    }
    public static void main(String[] args)
    { 
        int[][] matrix={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        sprial(matrix);
    }
}