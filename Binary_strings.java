public class Binary_strings{

        public static void binaryStrings(int n,int i,String str)
        {
            //base case
            if(n==0)
            {
                System.out.println(str);
                return;
            }
            //actual work
            //i mtlb last positon pe konsa char hai
            if(i==0)
            {
                binaryStrings(n-1, 0, str+"0"); // 1 2 3 4
                binaryStrings(n-1, 1, str+"1"); // 1 2 3 
            }
            else{
                binaryStrings(n-1, 0, str+"0"); // 1 2 
            }
            // binaryStrings(n-1, 0, str+"0");

            // if(i==0)
            // {
            //     binaryStrings(n-1, 1, str+"1");
            // }

            // System.out.println(str);
        }
        public static void main(String[] args)
        {
            binaryStrings(3, 0, " ");
        }
}