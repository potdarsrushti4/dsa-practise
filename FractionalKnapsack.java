import java.util.*;
public class FractionalKnapsack{
    public static void main(String[] args) {
        
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        //i always want a profit i.e higher values lower weight(so that i can get as many item as i can)

        //ratio
        Double[][] ratio = new Double[val.length][2];
        // Double[] ratio = new Double[val.length];
        for(int i = 0 ; i < ratio.length ; i++)
        {
            ratio[i][0] = (double) i;
            ratio[i][1] = val[i] / (double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(obj -> obj[1]));
        
        int capacity = W;
        int finalValue = 0;
        for(int i = ratio.length-1 ; i >=0 ; i--)
        {
            int index = ratio[i][0].intValue(); 
            if(weight[index] <= capacity) //include full item
            {
                finalValue += val[index];
                capacity -= weight[index];
            }
            else{ //include fractional item
                finalValue += ratio[i][1] * capacity;
                break;
            }
        }

        System.out.println("Total profit : "+finalValue);
    }
} 