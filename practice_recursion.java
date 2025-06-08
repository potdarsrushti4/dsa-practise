public class practice_recursion{
    // public static void findOccurrences(int[] arr,int key,int i)
    // {
    //     //base case
    //     if(i==arr.length)
    //     {
    //         return;
    //     }
    //     //actual work
    //     if(arr[i] == key)
    //     {
    //         System.out.print(i + " ");
    //     }
    //     findOccurrences(arr, key, i+1);
    // }

    // public static void convertString(int num,String[] numbers,int i)
    // {
    //     String numberString = String.valueOf(num);
        
    //     //base case
    //     if(i==numberString.length())
    //     {
    //         return;
    //     }
    //     //actual work
    //     System.out.print(numbers[Integer.parseInt(String.valueOf(numberString.charAt(i)))]+" ");

    //     convertString(num, numbers, i+1);
    // }

    public static int strlength(String str,int i,int counter)
    {
        //work
        if(i == str.length())
        {
            return counter;
        }
        else
        {
            counter=counter+1;
            // System.out.println(counter);
            return strlength(str, i+1,counter);
 
        }
        
    }

    public static void main(String[] args) {
        // int[] arr = { 2,4,5,2,7,8,2};
        // findOccurrences(arr, 2, 0);

        
        // String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        // convertString(2004, numbers, 0);

        String str = "abcde";
        System.out.println(strlength(str,0,0));
    }
}