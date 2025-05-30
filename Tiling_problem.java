public class Tiling_problem{

    public static int tilingProblem(int n)
    {
        //base case
        if(n==0 || n==1)
        {
            return 1;
        }
        //actual task
        //vertical choice
        int nm1 = tilingProblem(n-1);
        //horixontal choice
        int nm2 = tilingProblem(n-2);

        return nm1 + nm2;
    }
    public static void main(String[] args)
    {
        System.out.println(tilingProblem(4));
    }
}