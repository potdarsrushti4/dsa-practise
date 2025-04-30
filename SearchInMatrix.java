//searching element in a sorted matrix
public class SearchInMatrix{
    //the starting point(element) is bottom-left element 
    public static boolean searchElement(int[][] matrix,int target)
    {
        int column = 0;
        int row = matrix.length - 1;

        while(column<matrix.length && row>=0)
        {
            if(matrix[row][column] == target)
            {
                System.out.print("Element found at : ("+row+")"+"("+column+")");
                return true;
            }
            else if(target > matrix[row][column])
            {
                column++;
            }
            else 
            {
                row--;
            }
        }
        System.out.println("key not found");
        return false;
    }
    //here the starting point is top-right element 
    // public static boolean searchElement(int[][] matrix,int target)
    // {
    //     int row = 0;
    //     int column = matrix.length - 1;

    //     while(row<matrix.length && column>0)
    //     {
            
    //         if(matrix[row][column] == target)
    //         {
    //             System.out.print("Element found at : ("+row+")"+"("+column+")");
    //             return true;
    //         }
    //         else if(target < matrix[row][column])
    //         {
    //             column--;
    //         }
    //         else 
    //         {
    //             row++;
    //         }
    //     }
    //     System.out.println("key not found");
    //     return false;
    // }
    public static void main(String[] args)
    {
        int[][] matrix = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        
        int target = 10;
        searchElement(matrix, target);
    }
}