public class xpowern{
    public static int calculatePower(int x,int n)
    {
        if(n==1)
        {
            return x;
        }
        int xnm1 = calculatePower(x,n-1);
        int xn = x * xnm1;

        // int xn = x * calculatePower(x,n-1);
        return xn;

    }

    //optimized T.C = O(log n)
    public static int optimized(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        /*   now here still the T.C is O(n)
        int halfPower = optimized(x, n/2) * optimized(x, n/2);
        */
        //actual optimization

        int halfsq = optimized(x, n/2);
        int halfPower = halfsq * halfsq;

        if(n%2 !=0)
        {
            halfPower = x * halfPower;
        }

        return halfPower;
    }
    public static void main(String[] args) {
        System.out.println(optimized(2, 10));
    }
}