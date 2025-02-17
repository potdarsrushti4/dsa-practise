public class subarrays{

    public static void printsubarrays(int[] arr){
        /*loop according to no. of elements present 
        mtlb itni baar hume jodiya/ subarrays banane hai

        */
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            //jis elements se jodiya banana shuru krna hai
            for(int j = i;j < arr.length; j++)
            {
                int end=j;
                //actually making subarrays (printing)
                for(int k = start;k<=end;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        printsubarrays(arr);
    }
}