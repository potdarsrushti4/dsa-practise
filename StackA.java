//Next greater element
import java.util.*;
public class StackA{
    public static void nxtGreator(int[] arr,int[] nG, Stack<Integer> s)
    {
        for(int i = arr.length-1 ; i >=0 ; i--)
        {
            //Step 1:
            while(!s.isEmpty() && arr[s.peek()] <= arr[i])
            {
                s.pop();
            }
            //step 2:
            if(s.isEmpty())
            {
                nG[i] = -1;
            }
            else{
                nG[i] = arr[s.peek()]; 
            }

            //step 3
            s.push(i);
        }

        System.out.println(Arrays.toString(nG));
    }
    public static void main(String[] args)
    {
        int arr[] = {6, 8, 0, 1, 3};
        int nextGreator[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        nxtGreator(arr, nextGreator, s);
    }
}