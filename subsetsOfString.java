//subsets of string using backtraking

//sbset also includes null set (phi) too
//  String of length n gives 2^n
public class subsetsOfString{
    public static void subset(String str,int index,String newStr)
    {
        //base case
        if(index == str.length())
        {
            System.out.println(newStr); 
            return;
        }
        //include current char
        
        subset(str, index+1, newStr+str.charAt(index));

        //exclude current char
        subset(str, index+1, newStr);
    }

    public static void main(String[] args) {
        String str = "abc";
        subset(str, 0, "");
    }
     
}