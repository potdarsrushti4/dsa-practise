public class FriendPairing {

    public static int pairingPrblm(int n)
    {
        //base case
        if(n==0 || n==1)
        {
            return 1;
        }
        //single choice
        int fnm1 = pairingPrblm(n-1);

        //pair choice
        int fnm2 = pairingPrblm(n-2);

        int pairWays = (n-1) * fnm2;
        //n-1 -> pairing choices kitne baki hai 
        //fnm2 -> bakike bache hue options kitne the 
        int totalWays = fnm1 + pairWays;
        return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(pairingPrblm(4));
    }
}