//finding fact of no using RECURSION

public class Fact_recursion
{
    // static int fact,fn_minus_1 = 0;
    // public static int getFact(int n)
    // {
    //     if(n==0)
    //     {
    //         return 1;
    //     }
    //     fn_minus_1 = getFact(n-1);
    //     fact = n * fn_minus_1;
    //     return fact;
    // }

    //sum of first natural n numbers
    public static int getSum(int n)
    {
        int sum,sn_minus_1 ;
        if(n == 1)
        {
            return 1;
        }
        sn_minus_1 = getSum(n-1);
        sum = n + sn_minus_1;
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        
        // System.out.println(getFact(n));

        System.out.println(getSum(n));

    }
}