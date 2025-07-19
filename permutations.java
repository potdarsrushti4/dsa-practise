//permutation is arrangin a elemnt in different arrangements i.e different permutations 
//eg "abc" => abc, acb, bac, bca .. total 6
//for n length string it will be n! combination(n factorial)
//array of length n will also be n!
//this enumeration type of backtracking
public class permutations{
    public static void findPermutation(String str,String result)
    {
        //base case
        if(str.length()==0)
        {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            findPermutation(newStr, result+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");

    }
}