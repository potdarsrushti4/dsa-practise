//Finding fibonacci series using recurssion

public class fibonacci{

    public static int fib(int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static void main(String[] args) {
        // int n = 5;
        // fib(n);

        System.out.println(fib(25));
        System.out.println(fib(26));
    }
}