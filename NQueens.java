//T.C is O(n!)
//1. Printing all the solutions
//2. Printing the total ways

// public class NQueens{
//     public static void printBoard(char[][] board)
//     {
//         for(int i=0; i<board.length;i++)
//         {
//             for(int j =0; j<board.length;j++)
//             {
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static boolean isSafe(char board[][], int row, int col)
//     {
//         //vertically up
//         for(int i = row-1; i>=0 ; i--)
//         {
//             if(board[i][col] == 'Q')
//             {
//                 return false;
//             }
//         }

//         //diagonally left up
//         for(int i = row-1,j=col-1; j >= 0 && i>=0 ; j--,i-- )
//         {
//             if(board[i][j] == 'Q')
//             {
//                 return false;
//             }
//         }

//         //diagonally right up
//         for(int i = row-1,j=col+1 ; i >= 0 && j < board.length ; i--,j++)
//         {
//             if(board[i][j] == 'Q')
//             {
//                 return false;
//             }
//         }

//         return true;

//     }
//     public static void nQueens(char board[][], int row)
//     {
//         //base case
//         if(row==board.length)
//         {
//             // System.out.println("--------");
//             // printBoard(board);
//             counter++;
//             return;
//         }
//         //kaam
//         for(int j=0; j<board.length; j++)
//         {
//             if(isSafe(board, row, j))
//             {
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);
//                 board[row][j] = 'X';
//             }
//         }
//     }

//     static int counter = 0;
//     public static void main(String[] args) {
//         int n = 4 ;
//         char[][] board = new char[n][n];

//         //initialize
//         for(int i = 0; i < n ; i++)
//         {
//             for(int j = 0; j<n; j++)
//             {
//                 board[i][j] = 'X';
//             }
//         }

//         nQueens(board, 0);
//         System.out.println("Total ways to solve NQueens : "+counter);
//     }
// }

//3. To check if a problem can be solved and print only 1 solution
public class NQueens{
    public static void printBoard(char[][] board)
    {
        for(int i=0; i<board.length;i++)
        {
            for(int j =0; j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col)
    {
        //vertically up
        for(int i = row-1; i>=0 ; i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        //diagonally left up
        for(int i = row-1,j=col-1; j >= 0 && i>=0 ; j--,i-- )
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        //diagonally right up
        for(int i = row-1,j=col+1 ; i >= 0 && j < board.length ; i--,j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        return true;

    }
    public static boolean nQueens(char board[][], int row)
    {
        //base case
        if(row==board.length)
        {
            // System.out.println("--------");
            printBoard(board);
            counter++;
            return true;
        }
        //kaam
        for(int j=0; j<board.length; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j] = 'X'; //bactracking step
            }
        }

        return false;
    }

    static int counter = 0;
    public static void main(String[] args) {
        int n = 2 ;
        char[][] board = new char[n][n];

        //initialize
        for(int i = 0; i < n ; i++)
        {
            for(int j = 0; j<n; j++)
            {
                board[i][j] = 'X';
            }
        }

        if(nQueens(board, 0)){
            System.out.println("Soltuion is possible");
        }
        else{System.out.println("SOlution is not possible");}
    }
}