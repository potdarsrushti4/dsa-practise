public class TowerOfHanoi{
    public static void towerOfHanoi(int n,String src, String helper,String dest )
    {
        if(n==1)
        {
            System.out.println("Transferring disk "+n+" from "+src+" to "+dest);
            return;
        }

        //Transferring n-1 from src to helper
        towerOfHanoi(n-1, src, dest,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);

        //Transferring n-1 from src to dest
        towerOfHanoi(n-1, helper, src, dest);

    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "Src", "Helper", "Dest");
        
    }
}