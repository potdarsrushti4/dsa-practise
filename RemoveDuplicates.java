//using recurssion
public class RemoveDuplicates{

    public static void fun(String str,boolean map[], int i,StringBuilder sb)
    {
        //base case
        if(i==str.length())
        {
            System.out.println(sb);
            return;
        }
        //actual work
        char ch = str.charAt(i);

        if(map[ch-'a'] != true)
        {
            sb.append(ch);
            map[ch-'a'] = true;
            fun(str, map, i+1, sb);
        }
        else{
            fun(str, map, i+1, sb);
        }
    }
    public static void main(String[] args) {
        String str = "apnacollege";
        fun(str, new boolean[26], 0, new StringBuilder());
    }
}