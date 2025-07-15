import java.util.*;
//using greedy Algporithms
public class ActivitySelection{
    public static void main(String[] args)
    {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
                    //AO A1 A2 A3 A4 ..

        //soritng (if the end[] is not given as sorted)
        int act[][] = new int[start.length][3];
        for(int i = 0 ; i < act.length ; i++)
        {
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        Arrays.sort(act, Comparator.comparingDouble(obj -> obj[2]));
        ArrayList<Integer> activites = new ArrayList<>(); 
        activites.add(act[0][0]);

        int lastEnd = act[0][2];
        for(int i = 1; i < end.length ; i++)
        {
            if(lastEnd <= act[i][1])
            {
                activites.add(i);
                lastEnd = act[i][2];
            }
        }

        for(int i = 0 ; i < activites.size() ; i++)
        {
            System.out.print("A"+activites.get(i)+" ");
        }

        //when end[] is given in sorted form
        // ArrayList<Integer> activites = new ArrayList<>(); 
        // activites.add(0);
        // int lastEnd = end[0];
        // for(int i = 1; i < end.length ; i++)
        // {
        //     if(lastEnd <= start[i])
        //     {
        //         activites.add(i);
        //         lastEnd = end[i];
        //     }
        // }

        // for(int i = 0 ; i < activites.size() ; i++)
        // {
        //     System.out.print("A"+activites.get(i)+" ");
        // }
    }
}