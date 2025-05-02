//Inverted and Rotated pyramid 
/*
    *
   ***
  ***** --> cut in half

  *
  **
  *** -> iska inverted means mirror image will be  

    *
   **
  *** -> this is to derive
*/

public class Inverted_pyramid{
    public static void main(String[] args) {
        int n =4;
        for(int i = 1 ; i <= 4 ; i++)
        {
            //every line conists of spaces + stars
            /*as u go from top to bottom the spaces goes on decreasing 
             and stars goes on increasing*/

            //print spaces, spaces are n-i in each row
            //n-i -> on each row i(row no) subtracted we get spaces 
            for(int j=1 ; j <= n-i ; j++)
            {
                System.out.print("  ");
            }

            //print stars (stars = i -> i.e row number)

            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
}