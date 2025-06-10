//using recursion

public class StringSubsequence{
    public static void printSubsequence(String str,int i,String newStr,int len)
    {
        //base case
        if(i==str.length())
        {
            if(len>=1 && newStr.charAt(0)==newStr.charAt(len-1))
            {
                System.out.println(newStr);
            }
            return;
        }

        //actual work
        //include current character
        printSubsequence(str, i+1, newStr+str.charAt(i),newStr.length()+1);

        //exclude current char
        printSubsequence(str, i+1, newStr,newStr.length());
    }
    public static void main(String[] args) {
        printSubsequence("abcab", 0, "",0);
    }
}